package com.liyi.design.pattern.behavior.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registryColleague(name, this);
    }

    @Override
    void sendMessage(int status, String name) {
        getMediator().sendMessage(status, name);
    }

    public void work(int status){
        if(status == 0){
            System.out.println("电视机开始");
        }else{
            System.out.println("电视机停止");
        }
    }
}
