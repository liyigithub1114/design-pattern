package com.liyi.design.pattern.structure.adapter.springmvc;

public interface Controller {


}

class HttpController implements Controller {
    public void doHttp(){
        System.out.println("do Http");
    }
}

class SimpleController implements Controller {
    public void doSimple(){
        System.out.println("do Simple");
    }
}

class AnnotationController implements Controller {
    public void doAnnotation(){
        System.out.println("do Annotation");
    }
}