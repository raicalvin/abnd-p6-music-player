package com.example.gomezmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Back To You", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Stars Dance", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Come And Get It", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Bad Liar", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Birthday", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Kill 'Em With Kindness", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Wolves", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Hands To Myself", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Same Old Love", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("The Heart Wants What It Wants", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Slow Down", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Me And The Rhythm", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("A Year Without Rain", "Selena Gomez", R.drawable.cover_stars_dance));
        songs.add(new Song("Love Will Remember", "Selena Gomez", R.drawable.cover_stars_dance));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list_songs);

        listView.setAdapter(adapter);


    }
}
