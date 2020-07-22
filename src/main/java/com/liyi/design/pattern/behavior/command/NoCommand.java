package com.liyi.design.pattern.behavior.command;

public class NoCommand implements Command{
    //空实现，以便于实例化，也是一种设计模式
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
