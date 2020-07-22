package com.liyi.design.pattern.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//无法代理声明为final的类
public class CglibProxy implements MethodInterceptor{

    Object object;

    public CglibProxy(Object object){
        setObject(object);
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getInstance(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(object.getClass());

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib代理开始");
        Object invoke = method.invoke(object, objects);
        System.out.println("Cglib代理结束");
        return invoke;
    }
}
