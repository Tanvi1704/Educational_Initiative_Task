package org.example.Exercise_2.SmartHome;

public class DeviceFactory {
    public static Device createDevice(int id, String type, int... extraParams) {
        switch (type) {
            case "light":
                return new Light(id);
            case "thermostat":
                if (extraParams.length > 0) {
                    return new Thermostat(id, extraParams[0]);
                }
                throw new IllegalArgumentException("Temperature required for thermostat.");
            case "door lock":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type.");
        }
    }
}
