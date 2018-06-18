package com.example.gomezmusicplayer;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_list);

        // Create an ArrayList to hold all the Song objects
        ArrayList<Song> songsList = new ArrayList<>();

        // Create Song objects and instantiate them with the correct information
        songsList.add(new Song("Back To You", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Stars Dance", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Come And Get It", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Bad Liar", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Birthday", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Kill 'Em With Kindness", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Wolves", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Hands To Myself", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Same Old Love", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("The Heart Wants What It Wants", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Slow Down", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Me And The Rhythm", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("A Year Without Rain", "Selena Gomez", R.drawable.cover_stars_dance));
        songsList.add(new Song("Love Will Remember", "Selena Gomez", R.drawable.cover_stars_dance));

        // Create custom adapter
        SongAdapter songsAdapter = new SongAdapter(this, songsList);

        listView = findViewById(R.id.list_songs);

        listView.setAdapter(songsAdapter);

        listView.setOnItemClickListener(mMessageClickedHandler);

    }

    // Create a message handling object as an anonymous class.
    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Do something in response to the click
            Song songValue = (Song) listView.getItemAtPosition( position );
            String songName = songValue.getSongTitle();
            String artistName = songValue.getSongArtist();
            Log.i("Testing", "MainActivityClick: " + songName);
            Log.i("Testing", "MainActivityClick: " + artistName);

            intent = new Intent(MainActivity.this, NowPlayingActivity.class);

            // Add additional information to the intent to pull song and artist name in NowPlayingActivity
            intent.putExtra(Constants.SONG_TITLE, songName);
            intent.putExtra(Constants.ARTIST_NAME, artistName);

            startActivity(intent);
        }
    };

}
