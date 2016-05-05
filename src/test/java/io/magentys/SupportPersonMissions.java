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

    public Functions.FunctionalMission1<String,FunctionalAgent> remembersSomethingElse = (s, functionalAgent) -> {
        System.out.println(s);
        return functionalAgent;
    };

    public Functions.FunctionalMission2<String,String,FunctionalAgent> rememberMultipleThings = (s1, s2, functionalAgent) -> {
        System.out.println(String.join(",", s1, s2)); return functionalAgent;
    };
}
