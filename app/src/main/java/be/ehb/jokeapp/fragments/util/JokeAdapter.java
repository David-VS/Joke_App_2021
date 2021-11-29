package be.ehb.jokeapp.fragments.util;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import be.ehb.jokeapp.R;
import be.ehb.jokeapp.model.Joke;

public class JokeAdapter extends RecyclerView.Adapter<JokeAdapter.JokeViewHolder> {

    //inner class -> verwijst naar alles in één rij
    //deze wordt gerecycleerd
    class JokeViewHolder extends RecyclerView.ViewHolder{

        final TextView setupTV;

        public JokeViewHolder(@NonNull View itemView) {
            super(itemView);
            setupTV = itemView.findViewById(R.id.tv_row_joke);
        }
    }

    private ArrayList<Joke> items;

    public JokeAdapter(ArrayList<Joke> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public JokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.joke_row, parent, false);

        return new JokeViewHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull JokeViewHolder holder, int position) {
        Joke currentJoke = items.get(position);
        holder.setupTV.setText(currentJoke.getSetup());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
