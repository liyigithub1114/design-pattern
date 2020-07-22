package com.liyi.design.pattern.behavior.state;

public class Test {
    public static void main(String[] args) {
        MyActivity myActivity = new MyActivity(1);

        for(int i = 0; i < 10; i++){
            System.out.println("第" +  (i + 1) + "次");
            myActivity.deduce();

            if(myActivity.lottery()){
                myActivity.dispense();
            }
            System.out.println("------");
        }
    }
}
