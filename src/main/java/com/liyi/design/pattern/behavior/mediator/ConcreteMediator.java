package com.liyi.design.pattern.behavior.mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {

    private HashMap<String, Colleague> maps;

    public ConcreteMediator(){
        maps = new HashMap<>();
    }

    @Override
    public boolean registryColleague(String name, Colleague colleague) {
        this.maps.put(name, colleague);
        return true;
    }

    @Override
    public void sendMessage(int status, String name) {
        Colleague colleague = maps.get(name);
        if(colleague instanceof  Coffee){
            ((Coffee)colleague).work(status);
            ((TV)maps.get("TV")).work(status);
        }else if(colleague instanceof TV){
            ((TV)colleague).work(status);
        }
    }
}
