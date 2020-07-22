package com.liyi.design.pattern.behavior.mediator;

public class Coffee extends Colleague{


    public Coffee(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registryColleague(name, this);
    }

    @Override
    void sendMessage(int status, String name) {
        getMediator().sendMessage(status, name);
    }

    public void work(int status){
        if(status == 0){
            System.out.println("咖啡机开始");
        }else{
            System.out.println("咖啡机停止");
        }
    }
}
