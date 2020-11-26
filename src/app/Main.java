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

        Facade facade =
                new Facade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);

//        facade.filmBegin("star wars");
//        facade.filmEinde();
//
//        facade.radioBegin(89.00);
//        facade.radioEinde();
//
//        Facade.cdBegin("hits 2020");
//        Facade.cdEinde();

        

    }
}