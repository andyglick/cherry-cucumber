package io.magentys.cucumber.java8;

import cucumber.api.java8.StepdefBody;
import cucumber.runtime.java.TypeIntrospector;
import sun.reflect.ConstantPool;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author kostasmamalis
 */
public class CherryTypeInspector implements TypeIntrospector {

    private static final Method Class_getConstantPool;

    static {
        try {
            Class_getConstantPool = Class.class.getDeclaredMethod("getConstantPool");
            Class_getConstantPool.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("WeakerAccess")
    public static final TypeIntrospector INSTANCE = new CherryTypeInspector();

    @SuppressWarnings("unused")
    private String getTypeString(ConstantPool constantPool) {
        String[] memberRef = constantPool.getMemberRefInfoAt(constantPool.getSize() - 2);
        return memberRef[2];
    }

  @Override
  public Type[] getGenericTypes(Class<? extends StepdefBody> clazz, Class<? extends StepdefBody> interfac3) throws Exception
  {
    return new Type[0];
  }
}

