package io.magentys;

import io.magentys.functional.Functions;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class SupportPersonMissions {

    public Functions.FunctionalMission<FunctionalAgent> remembersSomething = systemSupport -> {
        systemSupport.keepsInMind("test", "test");
        System.out.println("hahaha");
        return systemSupport;
    };
}
