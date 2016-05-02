package io.magentys;


import io.magentys.cucumber.java8.CherryOnTop;

public class ExampleStepDefinitions implements CherryOnTop {

    private final FunctionalAgent asSystemSupport = new FunctionalAgent(new CoreMemory());
    public static final SupportPersonMissions I = new SupportPersonMissions();

    public ExampleStepDefinitions() {

            CherryStep("I remember something", asSystemSupport, I.remember);

    }


}
