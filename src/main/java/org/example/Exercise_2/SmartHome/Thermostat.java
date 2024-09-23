package org.example.Exercise_2.SmartHome;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "thermostat");
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + id + " is already on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat " + id + " is already off.");
    }

    @Override
    public String getStatus() {
        return "Temperature is set to " + temperature + " degrees.";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
