package io.magentys;

import io.magentys.cucumber.java8.CherryOnTop;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ExampleStepDefinitions implements CherryOnTop {

    private final FunctionalAgent systemSupportAgent = new FunctionalAgent(new CoreMemory());
    public static final SupportPersonMissions systemSupportPerson = new SupportPersonMissions();

    public ExampleStepDefinitions() {
        CherryStep("I remember something", systemSupportPerson.remembersSomething );
        CherryStep("I remember that (.+) is wrong", systemSupportPerson.remembersSomethingElse);
        CherryStep("I remember (.+) and (.+)", systemSupportPerson.rememberMultipleThings);
    }

    @Override
    public FunctionalAgent getFunctionalAgent() {
        return systemSupportAgent;
    }
}
