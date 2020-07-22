package com.liyi.design.pattern.behavior.command;

public class Test {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.buttonOn(0);
        remoteController.buttonOff(0);
        remoteController.undo();
        remoteController.undo();
    }
}
