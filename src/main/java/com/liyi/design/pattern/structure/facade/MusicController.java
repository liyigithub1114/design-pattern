package com.liyi.design.pattern.structure.facade;

public class MusicController extends Controller{

    //单例
    private static MusicController instance = new MusicController();

    private MusicController(){

    }

    public static MusicController getInstance(){
        return  instance;
    }

    @Override
    boolean open() {
        System.out.println("MusicController open = "+ true);
        return true;
    }

    @Override
    boolean close() {
        System.out.println("MusicController close = "+ true);
        return true;
    }
}
