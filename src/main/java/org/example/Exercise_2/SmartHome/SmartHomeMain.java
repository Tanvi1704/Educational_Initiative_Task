package org.example.Exercise_2.SmartHome;


public class SmartHomeMain {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();

        // Creating devices
        Device light = DeviceFactory.createDevice(1, "light");
        Device thermostat = DeviceFactory.createDevice(2, "thermostat", 70);
        Device doorLock = DeviceFactory.createDevice(3, "door lock");

        // Adding devices to the system
        system.addDevice(light);
        system.addDevice(thermostat);
        system.addDevice(doorLock);

        // Setting schedules
        system.setSchedule(2, "06:00", "Turn On");

        // Adding triggers
        system.addTrigger("temperature > 75", "turnOff(1)");

        // Turning devices on and off
        system.turnOn(1);
        system.turnOff(3);

        // Print status reports, schedules, and triggers
        system.printStatusReport();
        system.printSchedules();
        system.printTriggers();
    }
}
