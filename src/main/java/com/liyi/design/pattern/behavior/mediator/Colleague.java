package com.liyi.design.pattern.behavior.mediator;

public abstract class Colleague {

    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator , String name){
        this.mediator = mediator;
        this.name = name;
    }

    abstract void sendMessage(int status, String name);

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }
}
