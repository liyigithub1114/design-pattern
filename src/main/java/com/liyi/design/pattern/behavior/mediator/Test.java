package com.liyi.design.pattern.behavior.mediator;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague = new Coffee(mediator, "Coffee");
        Colleague colleague1 = new TV(mediator, "TV");

        colleague.sendMessage(0,colleague.getName());

        colleague.sendMessage(1,colleague.getName());

        mediator.sendMessage(0,colleague.getName());
    }
}
