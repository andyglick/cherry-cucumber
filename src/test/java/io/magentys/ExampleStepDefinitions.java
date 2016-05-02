package io.magentys;


import io.magentys.cucumber.java8.CherryOnTop;

public class ExampleStepDefinitions implements CherryOnTop {

    private final FunctionalAgent systemSupportAgent = new FunctionalAgent(new CoreMemory());
    public static final SupportPersonMissions systemSupportPerson = new SupportPersonMissions();

    public ExampleStepDefinitions() {

        CherryStep("I remember something", systemSupportPerson.remembersSomething );

    }


    @Override
    public FunctionalAgent getFunctionalAgent() {
        return systemSupportAgent;
    }
}
