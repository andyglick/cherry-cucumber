package io.magentys.cucumber.java8;

import cucumber.runtime.java.TypeIntrospector;
import sun.reflect.ConstantPool;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by kostasmamalis on 02/05/16.
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

    public static final TypeIntrospector INSTANCE = new CherryTypeInspector();

    @Override
    public Type[] getGenericTypes(Class<?> clazz) throws Exception {
        return new Type[0];
    }

    private String getTypeString(ConstantPool constantPool) {
        String[] memberRef = constantPool.getMemberRefInfoAt(constantPool.getSize() - 2);
        return memberRef[2];
    }

}

