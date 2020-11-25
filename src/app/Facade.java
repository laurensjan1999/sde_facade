package app;

public class Facade {
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public Facade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void filmBegin(String movie) {
        System.out.println("Begin een film te kijken");
        popper.on();
        popper.pop();
        lights.dim(50);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }


    public void filmEinde() {
        System.out.println("film is ten einde");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void cdBegin(String cdTitle) {
        System.out.println("begin luisteren cd");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
    }

    public void cdEinde() {
        System.out.println("einde van de cd");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void radioBegin(double frequency) {
        System.out.println("start radio");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void radioEinde() {
        System.out.println("schakel radio uit");
        tuner.off();
        amp.off();
    }
}
