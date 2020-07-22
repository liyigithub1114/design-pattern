package com.liyi.design.pattern.behavior.state;

public class CanNotDispenseState extends MyState {

    MyActivity myActivity;

    public CanNotDispenseState(MyActivity myActivity){
        this.myActivity = myActivity;
    }

    @Override
    void deduceMoney() {
        if(myActivity.getCount() > 0){
            System.out.println("付款成功");
            myActivity.setMyState(myActivity.getDeduceState());
        }else{
            System.out.println("奖品已经全部抽空");
        }
    }

    @Override
    boolean lottery() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    void dispensePrise() {
        System.out.println("不能发放奖品");
    }
}
