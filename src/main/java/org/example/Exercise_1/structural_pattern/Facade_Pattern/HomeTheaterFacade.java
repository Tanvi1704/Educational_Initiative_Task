package org.example.Exercise_1.structural_pattern.Facade_Pattern;

// Facade class to simplify the control of subsystems
public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        projector.off();
        soundSystem.off();
        dvdPlayer.stopMovie();
        dvdPlayer.off();
    }
}
