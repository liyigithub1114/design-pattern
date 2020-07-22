package com.liyi.design.pattern.structure.adapter.springmvc;

public interface HandlerAdapter {

    boolean support(Object controller);

    void handler(Object controller);

}

class SimpleControllerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object controller) {
        return controller instanceof SimpleController;
    }

    @Override
    public void handler(Object controller) {
        //如果 support = true才会进入此方法

        ((SimpleController)controller).doSimple();
    }
}

class HttpControllerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object controller) {
        return controller instanceof HttpController;
    }

    @Override
    public void handler(Object controller) {
        //如果 support = true才会进入此方法

        ((HttpController)controller).doHttp();
    }
}

class AnnotationControllerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object controller) {
        return controller instanceof AnnotationController;
    }

    @Override
    public void handler(Object controller) {
        //如果 support = true才会进入此方法

        ((AnnotationController)controller).doAnnotation();
    }
}