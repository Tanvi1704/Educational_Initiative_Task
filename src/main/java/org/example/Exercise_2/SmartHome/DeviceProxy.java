package org.example.Exercise_2.SmartHome;

public class DeviceProxy extends Device {
    private Device device;

    public DeviceProxy(Device device) {
        super(device.getId(), device.getType());
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
