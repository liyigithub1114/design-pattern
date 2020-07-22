package com.liyi.design.pattern.structure.facade;

public class PopcornController extends Controller{


    //单例
    private static PopcornController instance = new PopcornController();

    private PopcornController(){

    }

    public static PopcornController getInstance(){
        return instance;
    }
    @Override
    boolean open() {
        System.out.println("PopcornController open = "+ true);
        return true;
    }

    @Override
    boolean close() {
        System.out.println("PopcornController close = "+ true);
        return true;
    }
}
