package com.liyi.design.pattern.structure.flyweight;

import java.util.HashMap;

public class WebSiteFactory {

    private HashMap<String, ConcreateWebsite> pools = new HashMap<>();

    public WebSite getWebSite(String type){
        if(!pools.containsKey(type)){
            pools.put(type, new ConcreateWebsite(type));
        }

        return pools.get(type);
    }

    public int getCount(){
        return pools.size();
    }
}
