package be.ehb.jokeapp.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class JokeViewModel extends AndroidViewModel {

    private MutableLiveData<ArrayList<Joke>> jokes;

    public JokeViewModel(@NonNull Application application) {
        super(application);
        jokes = new MutableLiveData<>(setupJokes());
    }

    private ArrayList<Joke> setupJokes() {
        ArrayList<Joke> neededForSetup = new ArrayList<>();
        neededForSetup.add(new Joke("Het is groen en het weegt niet veel", "lichtgroen"));
        neededForSetup.add(new Joke("Het is geel en het weegt niet veel", "lichtgeel"));
        neededForSetup.add(new Joke("Het is rood en het weegt niet veel", "lichtrood"));

        return neededForSetup;
    }

    public MutableLiveData<ArrayList<Joke>> getJokes() {
        return jokes;
    }

    public void insert(Joke j){
        ArrayList<Joke> tempList = jokes.getValue();
        tempList.add(j);
        jokes.setValue(tempList);
    }
}
