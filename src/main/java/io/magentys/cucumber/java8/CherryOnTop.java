package io.magentys.cucumber.java8;

import cucumber.api.java8.En;
import cucumber.api.java8.StepdefBody;
import cucumber.runtime.java.JavaBackend;
import io.magentys.FunctionalAgent;
import io.magentys.functional.Functions;


public interface CherryOnTop extends En {



    default void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final Functions.FunctionalMission<FunctionalAgent> body) {
        StepdefBody.A0 a0Body = () -> body.apply(functionalAgent);
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, a0Body, CherryTypeInspector.INSTANCE);
    }




//    default void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final Functions.FunctionalMission<FunctionalAgent> body) {
////        StepdefBody.A0 a0Body = () -> body.apply(functionalAgent);
////        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, a0Body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A1<T1> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A1<T1> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A2<T1,T2> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A2<T1,T2> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A3<T1,T2,T3> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A3<T1,T2,T3> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A4<T1,T2,T3,T4> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A4<T1,T2,T3,T4> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4,T5> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A5<T1,T2,T3,T4,T5> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4,T5> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A5<T1,T2,T3,T4,T5> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4,T5,T6> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A6<T1,T2,T3,T4,T5,T6> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4,T5,T6> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A6<T1,T2,T3,T4,T5,T6> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4,T5,T6,T7> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A7<T1,T2,T3,T4,T5,T6,T7> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4,T5,T6,T7> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A7<T1,T2,T3,T4,T5,T6,T7> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4,T5,T6,T7,T8> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A8<T1,T2,T3,T4,T5,T6,T7,T8> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4,T5,T6,T7,T8> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A8<T1,T2,T3,T4,T5,T6,T7,T8> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//
//    default <T1,T2,T3,T4,T5,T6,T7,T8,T9> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final StepdefBody.A9<T1,T2,T3,T4,T5,T6,T7,T8,T9> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }
//
//    default <T1,T2,T3,T4,T5,T6,T7,T8,T9> void CherryStep(final String regexp, final FunctionalAgent functionalAgent, final long timeoutMillis, final StepdefBody.A9<T1,T2,T3,T4,T5,T6,T7,T8,T9> body) {
//        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeoutMillis, body, ConstantPoolTypeIntrospector.INSTANCE);
//    }

}
