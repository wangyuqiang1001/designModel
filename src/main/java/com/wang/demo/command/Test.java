package com.wang.demo.command;

public class Test {

    public static void main(String[] args) {
        Meter meter = new Meter();
        Light light = new Light();
        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        LightCloseCommand lightCloseCommand = new LightCloseCommand(light);
        LightOpenCommand lightOpenCommand = new LightOpenCommand(light);
        MeterReadCommand meterReadCommand = new MeterReadCommand(meter);
        MeterWriteCommand meterWriteCommand = new MeterWriteCommand(meter);
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0, doorCloseCommand);
        controlPanel.setCommand(1, doorOpenCommand);
        controlPanel.setCommand(2, lightOpenCommand);
        controlPanel.setCommand(3, lightCloseCommand);
        controlPanel.setCommand(4, meterReadCommand);
        controlPanel.setCommand(5, meterWriteCommand);
        controlPanel.keyPress(0);
        controlPanel.keyPress(1);
        controlPanel.keyPress(2);
        controlPanel.keyPress(3);
        controlPanel.keyPress(4);
        controlPanel.keyPress(6);

    }
}
