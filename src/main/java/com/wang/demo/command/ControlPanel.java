package com.wang.demo.command;

import java.util.Arrays;

public class ControlPanel {

    private static int SIZE = 9;

    private Command[] commands;

    public ControlPanel() {
        commands = new Command[ControlPanel.SIZE];
//        Arrays.stream(commands).forEach(e -> e = new EmptyCommand());

        for (int i = 0; i < commands.length; i++) {
            commands[i] = new EmptyCommand();
        }
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void keyPress(int index) {
        commands[index].execute();
    }
}
