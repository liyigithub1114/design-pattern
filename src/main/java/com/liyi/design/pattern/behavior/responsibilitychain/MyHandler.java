package com.liyi.design.pattern.behavior.responsibilitychain;

public abstract class MyHandler {

    private MyHandler myHandler;
    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMyHandler(MyHandler myHandler) {
        this.myHandler = myHandler;
    }

    public String getName() {
        return name;
    }

    public MyHandler getMyHandler() {
        return myHandler;
    }

    abstract void intercept(MyResource myResource);
}
