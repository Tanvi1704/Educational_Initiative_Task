package org.example.Exercise_2.SmartHome;

public class Light extends Device {

    public Light(int id) {
        super(id, "light");
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light " + id + " is turned on.");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light " + id + " is turned off.");
    }

    @Override
    public String getStatus() {
        return isStatus() ? "On" : "Off";
    }
}
