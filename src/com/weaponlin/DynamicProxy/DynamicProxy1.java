package com.weaponlin.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Weapon Lin on 2017/2/10.
 */
public class DynamicProxy1 implements InvocationHandler {

    private Object obj ;
    public DynamicProxy1(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(obj,args);

        return result;
    }
}
