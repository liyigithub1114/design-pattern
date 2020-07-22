package com.liyi.design.pattern.behavior.command;

import java.util.Stack;

public class RemoteController {

    private Command commandOn[];
    private Command commandOff[];
    private Stack<Command> undoStack;

    public RemoteController(){
        commandOn = new Command[5];
        commandOff = new Command[5];
        undoStack = new Stack<>();
        for(int i = 0; i < 5; i++){
            commandOn[i] = new NoCommand();
            commandOff[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command on, Command off){
        commandOn[index] = on;
        commandOff[index] = off;
    }

    public void buttonOn(int index){
        commandOn[index].execute();
        undoStack.push(commandOn[index]);
    }

    public void buttonOff(int index){
        commandOff[index].execute();
        undoStack.push(commandOff[index]);
    }

    public void undo(){
        if(!undoStack.isEmpty()){
            undoStack.pop().undo();
        }else{
            System.out.println("没有打开任何开关");
        }
    }
}
