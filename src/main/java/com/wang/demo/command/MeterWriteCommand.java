package com.wang.demo.command;

public class MeterWriteCommand implements Command {

    private Meter meter;

    public MeterWriteCommand(Meter meter) {
        this.meter = meter;
    }

    @Override
    public void execute() {
        meter.writeMeter();
    }
}
