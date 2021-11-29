package be.ehb.jokeapp.model;

import java.util.ArrayList;

public enum JokeEnumSingleton {
    INSTANCE;

    public ArrayList<Joke> giveJokes(){
        ArrayList<Joke> neededForSetup = new ArrayList<>();
        neededForSetup.add(new Joke("Het is groen en het weegt niet veel", "lichtgroen"));
        neededForSetup.add(new Joke("Het is geel en het weegt niet veel", "lichtgeel"));
        neededForSetup.add(new Joke("Het is rood en het weegt niet veel", "lichtrood"));

        return neededForSetup;
    }
}
