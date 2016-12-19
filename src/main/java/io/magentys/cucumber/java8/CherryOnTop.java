package io.magentys.cucumber.java8;

import cucumber.api.java8.GlueBase;
import cucumber.runtime.java.JavaBackend;
import cucumber.runtime.java8.ConstantPoolTypeIntrospector;
import io.magentys.java8.FunctionalAgent;
import io.magentys.java8.functional.Functions;

@SuppressWarnings("unused")
public interface CherryOnTop extends GlueBase {

    FunctionalAgent getFunctionalAgent();

    default void CherryStep(final String regexp, final Functions.FunctionalMission<FunctionalAgent> body) {
        CherryStepBody.Body0 a0Body = () -> body.apply(getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, a0Body, CherryTypeInspector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission<FunctionalAgent> body) {
        CherryStepBody.Body0 a0Body = () -> body.apply(getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, a0Body, CherryTypeInspector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission1<String,FunctionalAgent> body) {
        CherryStepBody.Body1<String> aBody = p1 -> body.apply(p1, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission1<String,FunctionalAgent> body) {
        CherryStepBody.Body1<String> aBody = p1 -> body.apply(p1, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission2<String,String,FunctionalAgent> body) {
        CherryStepBody.Body2<String,String> aBody = (p1, p2) -> body.apply(p1, p2, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission2<String,String,FunctionalAgent> body) {
        CherryStepBody.Body2<String,String> aBody = (p1, p2) -> body.apply(p1, p2, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission3<String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body3<String,String,String> aBody = (p1, p2, p3) -> body.apply(p1, p2, p3, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission3<String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body3<String,String,String> aBody = (p1, p2, p3) -> body.apply(p1, p2, p3, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission4<String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body4<String,String,String,String> aBody = (p1, p2, p3, p4) -> body.apply(p1, p2, p3, p4, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission4<String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body4<String,String,String,String> aBody = (p1, p2, p3, p4) -> body.apply(p1, p2, p3, p4, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission5<String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body5<String,String,String,String,String> aBody = (p1, p2, p3, p4, p5) -> body.apply(p1, p2, p3, p4, p5, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission5<String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body5<String,String,String,String,String> aBody = (p1, p2, p3, p4, p5) -> body.apply(p1, p2, p3, p4, p5, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission6<String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body6<String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6) -> body.apply(p1, p2, p3, p4, p5, p6, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission6<String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body6<String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6) -> body.apply(p1, p2, p3, p4, p5, p6, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission7<String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body7<String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7) -> body.apply(p1, p2, p3, p4, p5, p6, p7, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission7<String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body7<String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7) -> body.apply(p1, p2, p3, p4, p5, p6, p7, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission8<String,String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body8<String,String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7, p8) -> body.apply(p1, p2, p3, p4, p5, p6, p7, p8, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission8<String,String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body8<String,String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7, p8) -> body.apply(p1, p2, p3, p4, p5, p6, p7, p8, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final Functions.FunctionalMission9<String,String,String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body9<String,String,String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> body.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, 0, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }

    default void CherryStep(final String regexp, final long timeout, final Functions.FunctionalMission9<String,String,String,String,String,String,String,String,String,FunctionalAgent> body) {
        CherryStepBody.Body9<String,String,String,String,String,String,String,String,String> aBody = (p1, p2, p3, p4, p5, p6, p7, p8, p9) -> body.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, getFunctionalAgent());
        JavaBackend.INSTANCE.get().addStepDefinition(regexp, timeout, aBody, ConstantPoolTypeIntrospector.INSTANCE);
    }
}
