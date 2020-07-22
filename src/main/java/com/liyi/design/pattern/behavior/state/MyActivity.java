package com.liyi.design.pattern.behavior.state;


public class MyActivity {

    MyState myState ;
    int count;

    MyState deduceState = new DeduceState(this);
    MyState lotteryState = new LotteryState(this);
    MyState dispenseState = new DispenseState(this);
    MyState canNotDispenseState = new CanNotDispenseState(this);

    public MyActivity(int count){
        //开始不能抽奖
        myState = deduceState;
        this.count = count;
    }

    public void deduce(){
        myState.deduceMoney();
    }

    public boolean lottery(){
        return myState.lottery();
    }

    public void dispense(){
        myState.dispensePrise();
    }

    public MyState getMyState() {
        return myState;
    }

    public void setMyState(MyState myState) {
        this.myState = myState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MyState getDeduceState() {
        return deduceState;
    }

    public void setDeduceState(MyState deduceState) {
        this.deduceState = deduceState;
    }

    public MyState getLotteryState() {
        return lotteryState;
    }

    public void setLotteryState(MyState lotteryState) {
        this.lotteryState = lotteryState;
    }

    public MyState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(MyState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public MyState getCanNotDispenseState() {
        return canNotDispenseState;
    }

    public void setCanNotDispenseState(MyState canNotDispenseState) {
        this.canNotDispenseState = canNotDispenseState;
    }
}
