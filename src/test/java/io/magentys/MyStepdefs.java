package io.magentys;


import io.magentys.cucumber.java8.CherryOnTop;

public class MyStepdefs implements CherryOnTop {

    private final FunctionalAgent asSystemSupport = new FunctionalAgent(new CoreMemory());


    public MyStepdefs() {

        CherryStep("I remember something", asSystemSupport, systemSupport -> {
            systemSupport.keepsInMind("test", "test");
            return asSystemSupport;
        });

    }


}
