package com.liyi.design.pattern.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler{

    private Object object;

    public DynamicProxy(Object object){
        setObject(object);
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这里是动态代理开始");
        Object res = method.invoke(object,args);
        System.out.println("这里是动态代理结束");
        return res;
    }
}
