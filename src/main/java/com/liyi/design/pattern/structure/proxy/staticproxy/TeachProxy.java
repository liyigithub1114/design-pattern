package com.liyi.design.pattern.structure.proxy.staticproxy;

public class TeachProxy implements ITeach {

    private ITeach iTeach;
    public TeachProxy(ITeach iTeach){
        setiTeach(iTeach);
    }



    public void setiTeach(ITeach iTeach) {
        this.iTeach = iTeach;
    }

    @Override
    public void teach() {
        System.out.println("这里是静态代理");
        iTeach.teach();
    }
}
