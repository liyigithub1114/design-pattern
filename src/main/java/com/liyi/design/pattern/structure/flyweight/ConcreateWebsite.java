package com.liyi.design.pattern.structure.flyweight;

public class ConcreateWebsite extends WebSite{

    //内部状态
    private String type = "";

    public ConcreateWebsite(String type){
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("当前使用的网站为 :" + type +" 使用的用户为 :" + user.getName());
    }
}
