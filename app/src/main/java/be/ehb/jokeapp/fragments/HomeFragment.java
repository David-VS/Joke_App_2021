package be.ehb.jokeapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import be.ehb.jokeapp.R;
import be.ehb.jokeapp.fragments.util.JokeAdapter;
import be.ehb.jokeapp.model.Joke;
import be.ehb.jokeapp.model.JokeEnumSingleton;
import be.ehb.jokeapp.model.JokeSingleton;
import be.ehb.jokeapp.model.JokeViewModel;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView mRecyclerView = rootView.findViewById(R.id.rv_jokes);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        JokeAdapter mJokeAdapter = new JokeAdapter(JokeEnumSingleton.INSTANCE.giveJokes());
        mRecyclerView.setAdapter(mJokeAdapter);
        /*
        JokeViewModel mJokeViewModel = new ViewModelProvider(getActivity()).get(JokeViewModel.class);
        mJokeViewModel.getJokes().observe(getActivity(), new Observer<ArrayList<Joke>>() {
            @Override
            public void onChanged(ArrayList<Joke> jokes) {
                JokeAdapter mJokeAdapter = new JokeAdapter(jokes);
                mRecyclerView.setAdapter(mJokeAdapter);
            }
        });
*/


        return rootView;
    }
}