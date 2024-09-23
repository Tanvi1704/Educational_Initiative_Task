package org.example.Exercise_1.structural_pattern.Facade_Pattern;

// Represents a DVD Player subsystem
public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is now ON.");
    }

    public void off() {
        System.out.println("DVD Player is now OFF.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stopMovie() {
        System.out.println("Movie stopped.");
    }
}

