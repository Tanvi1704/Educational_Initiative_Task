package org.example.Exercise_1.structural_pattern.Facade_Pattern;

// Represents a Sound System subsystem
public class SoundSystem {
    public void on() {
        System.out.println("Sound System is now ON.");
    }

    public void off() {
        System.out.println("Sound System is now OFF.");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }
}

