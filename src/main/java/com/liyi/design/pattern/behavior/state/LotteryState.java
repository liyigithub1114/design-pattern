package com.liyi.design.pattern.behavior.state;

public class LotteryState extends MyState{

    MyActivity myActivity;

    public LotteryState(MyActivity myActivity){
        this.myActivity = myActivity;
    }

    @Override
    void deduceMoney() {
        System.out.println("已经付过款了！");
    }

    @Override
    boolean lottery() {
        System.out.println("现在可以抽奖");
        int res = (int)(Math.random() * 10);
        if(res == 0){
            System.out.println("恭喜你中奖了");
            myActivity.setMyState(myActivity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾未中奖");
            myActivity.setMyState(myActivity.getDeduceState());
            return false;
        }
    }

    @Override
    void dispensePrise() {
        System.out.println("还没有进行抽奖");
    }
}
