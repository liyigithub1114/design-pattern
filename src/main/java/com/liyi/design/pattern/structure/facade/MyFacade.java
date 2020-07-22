package com.liyi.design.pattern.structure.facade;

public class MyFacade {
    private MusicController musicController;
    private DVDController dvdController;
    private PopcornController popcornController;

    public MyFacade(){
        musicController = MusicController.getInstance();
        dvdController = DVDController.getInstance();
        popcornController = PopcornController.getInstance();
    }

    public boolean open(){
        boolean flag = true;
        flag = flag && musicController.open();
        flag = flag && dvdController.open();
        flag = flag && popcornController.open();

        return flag;
    }

    public boolean close(){
        boolean flag = true;
        flag = flag && musicController.close();
        flag = flag && dvdController.close();
        flag = flag && popcornController.close();

        return flag;
    }
}
