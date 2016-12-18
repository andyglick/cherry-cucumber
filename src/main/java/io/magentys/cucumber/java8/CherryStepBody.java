package io.magentys.cucumber.java8;

import cucumber.api.java8.StepdefBody;

/**
 * @author kostasmamalis
 */
@SuppressWarnings("unused")
public interface CherryStepBody
{
  @FunctionalInterface
  interface Body0 extends StepdefBody
  {
    void accept();
  }

  @FunctionalInterface
  interface Body1<T1> extends StepdefBody
  {
    void accept(T1 p1);
  }

  @FunctionalInterface
  interface Body2<T1, T2> extends StepdefBody
  {
    void accept(T1 p1, T2 p2);
  }

  @FunctionalInterface
  interface Body3<T1, T2, T3> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3);
  }

  @FunctionalInterface
   interface Body4<T1, T2, T3, T4> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4);
  }

  @FunctionalInterface
   interface Body5<T1, T2, T3, T4, T5> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
  }

  @FunctionalInterface
   interface Body6<T1, T2, T3, T4, T5, T6> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
  }

  @FunctionalInterface
   interface Body7<T1, T2, T3, T4, T5, T6, T7> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
  }

  @SuppressWarnings("unused")
  @FunctionalInterface
   interface Body8<T1, T2, T3, T4, T5, T6, T7, T8> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7, T8 p8);
  }

  @SuppressWarnings("unused")
  @FunctionalInterface
   interface Body9<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends StepdefBody
  {
    void accept(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7, T8 p8, T9 p9);
  }
}
