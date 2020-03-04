package com.wang.demo.command;

public class EmptyCommand implements Command {
    @Override
    public void execute() {
        System.out.println("空的");
    }
}
