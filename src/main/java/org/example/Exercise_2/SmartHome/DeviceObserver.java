package org.example.Exercise_2.SmartHome;


import java.util.ArrayList;
import java.util.List;

public class DeviceObserver implements Observer {
    private List<Device> devices = new ArrayList<>();

    @Override
    public void update(Device device) {
        devices.add(device);
        System.out.println("Device status updated: " + device.getStatus());
    }

    public void printStatusReport() {
        for (Device device : devices) {
            System.out.println(device.getType() + " " + device.getId() + " is " + device.getStatus());
        }
    }
}
