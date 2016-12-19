package io.magentys;

import io.magentys.cucumber.java8.CherryOnTop;
import io.magentys.java8.FunctionalAgent;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ExampleStepDefinitions implements CherryOnTop {

    public static final SupportPersonMissions systemSupportPerson = new SupportPersonMissions();

    private final FunctionalAgent systemSupportAgent = new FunctionalAgent(new CoreMemory());

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
