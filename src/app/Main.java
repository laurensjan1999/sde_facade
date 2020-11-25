package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", dvd);
        TheaterLights lights = new TheaterLights("theater Lights");
        Screen screen = new Screen("screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        Facade Facade =
                new Facade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);

//        Facade.filmBegin("star wars");
//        Facade.filmEinde();
//
//        Facade.radioBegin(89.00);
//        Facade.radioEinde();
//
//        Facade.cdBegin("hits 2020");
//        Facade.cdEinde();

        

    }
}