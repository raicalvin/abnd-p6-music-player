package com.example.gomezmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_item);

        Intent receivedIntent = getIntent();

        String incomingSongName = receivedIntent.getStringExtra("SONG_TITLE");
        String incomingArtistName = receivedIntent.getStringExtra("ARTIST_NAME");

        Log.i("What Up", "Seeeeleeeeeeeena: " + incomingSongName);

        TextView songTitleTextView = (TextView) findViewById(R.id.song_title_text_view);
        songTitleTextView.setText(incomingSongName);

        TextView artistNameTextView = (TextView) findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(incomingArtistName);

    }
}
