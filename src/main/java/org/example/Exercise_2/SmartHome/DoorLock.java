package org.example.Exercise_2.SmartHome;


public class DoorLock extends Device {

    public DoorLock(int id) {
        super(id, "door lock");
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Door lock " + id + " is locked.");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Door lock " + id + " is unlocked.");
    }

    @Override
    public String getStatus() {
        return isStatus() ? "Locked" : "Unlocked";
    }
}
