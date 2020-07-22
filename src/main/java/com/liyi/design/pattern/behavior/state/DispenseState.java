package com.liyi.design.pattern.behavior.state;

public class DispenseState extends MyState{

    MyActivity myActivity;

    public DispenseState(MyActivity myActivity){
        this.myActivity = myActivity;
    }

    @Override
    void deduceMoney() {
        if(myActivity.getCount() > 0){
            System.out.println("扣除积分成功");
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
        System.out.println("恭喜您获得奖品");
        myActivity.setCount(myActivity.getCount() - 1);
    }
}
