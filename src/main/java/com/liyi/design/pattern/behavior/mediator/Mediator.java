package com.liyi.design.pattern.behavior.mediator;

public interface Mediator {
    boolean registryColleague(String name, Colleague colleague);

    void sendMessage(int status, String name);
}
