package org.example.Exercise_2.SmartHome;

public class Schedule {
    private int deviceId;
    private String time;
    private String command;

    public Schedule(int deviceId, String time, String command) {
        this.deviceId = deviceId;
        this.time = time;
        this.command = command;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getTime() {
        return time;
    }

    public String getCommand() {
        return command;
    }
}
