package org.example.Exercise_2.SmartHome;

public abstract class Device {
    protected int id;
    protected String type;
    protected boolean status;

    public Device(int id, String type) {
        this.id = id;
        this.type = type;
        this.status = false; // Default status
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
