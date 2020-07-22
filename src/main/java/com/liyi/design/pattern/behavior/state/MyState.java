package com.liyi.design.pattern.behavior.state;

public abstract class MyState {

    //扣50块
    abstract void deduceMoney();

    //抽奖状态
    abstract boolean lottery();

    //发放奖品
    abstract void dispensePrise();

}
