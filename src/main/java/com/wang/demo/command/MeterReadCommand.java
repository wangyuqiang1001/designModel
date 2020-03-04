package com.wang.demo.command;

public class MeterReadCommand implements Command {

    private Meter meter;

    public MeterReadCommand(Meter meter) {
        this.meter = meter;
    }

    @Override
    public void execute() {
        meter.readMeter();
    }
}
