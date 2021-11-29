package be.ehb.jokeapp.model;

import java.util.ArrayList;

public class JokeSingleton {
    //singleton pattern
    //een static instance van de klasse
    private final static JokeSingleton INSTANCE = new JokeSingleton();
    //constructor afschermen
    private JokeSingleton(){

    }
    public static JokeSingleton getINSTANCE() {
        return INSTANCE;
    }


    private ArrayList<Joke> jokes = new ArrayList<>();

    //Eigen data toevoegen aan Singleton
    public ArrayList<Joke> getJokes(){
        ArrayList<Joke> neededForSetup = new ArrayList<>();
        neededForSetup.add(new Joke("Het is groen en het weegt niet veel", "lichtgroen"));
        neededForSetup.add(new Joke("Het is geel en het weegt niet veel", "lichtgeel"));
        neededForSetup.add(new Joke("Het is rood en het weegt niet veel", "lichtrood"));

        return neededForSetup;
    }
}
