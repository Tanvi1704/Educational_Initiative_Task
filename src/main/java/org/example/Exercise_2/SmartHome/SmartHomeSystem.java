package org.example.Exercise_2.SmartHome;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHomeSystem {
    private Map<Integer, Device> devices = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();
    private List<Trigger> triggers = new ArrayList<>();
    private DeviceObserver observer = new DeviceObserver();

    public void addDevice(Device device) {
        devices.put(device.getId(), device);
        observer.update(device);
    }

    public void removeDevice(int id) {
        devices.remove(id);
    }

    public void turnOn(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOn();
            observer.update(device);
        }
    }

    public void turnOff(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOff();
            observer.update(device);
        }
    }

    public void setSchedule(int deviceId, String time, String command) {
        schedules.add(new Schedule(deviceId, time, command));
    }

    public void addTrigger(String condition, String action) {
        triggers.add(new Trigger(condition, action));
    }

    public void printStatusReport() {
        observer.printStatusReport();
    }

    public void printSchedules() {
        for (Schedule schedule : schedules) {
            System.out.println("Device ID: " + schedule.getDeviceId() + ", Time: " + schedule.getTime() + ", Command: " + schedule.getCommand());
        }
    }

    public void printTriggers() {
        for (Trigger trigger : triggers) {
            System.out.println("Condition: " + trigger.getCondition() + ", Action: " + trigger.getAction());
        }
    }
}
