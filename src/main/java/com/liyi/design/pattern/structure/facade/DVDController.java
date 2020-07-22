package com.liyi.design.pattern.structure.facade;

public class DVDController extends Controller {

    //单例
    private static DVDController instance = new DVDController();

    private DVDController(){

    }

    public static DVDController getInstance(){
        return instance;
    }

    @Override
    boolean open() {
        System.out.println("DVDController open = "+ true);
        return true;
    }

    @Override
    boolean close() {
        System.out.println("DVDController close = "+ true);
        return true;
    }
}
