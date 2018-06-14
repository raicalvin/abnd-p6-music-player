package com.example.gomezmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class StoreListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_listing_item);

        Intent receivedIntent = getIntent();

        String incomingSongName = receivedIntent.getStringExtra("SONG_TITLE");
        String incomingArtistName = receivedIntent.getStringExtra("ARTIST_NAME");

        TextView songTitleTextView = (TextView) findViewById(R.id.store_listing_song_title);
        TextView artistNameTextView = (TextView) findViewById(R.id.store_listing_artist_name);

        Log.i("StoreListingActivity", "store listing song name " + incomingSongName);
        Log.i("StoreListingActivity", "store listing artist name " + incomingArtistName);

        songTitleTextView.setText(incomingSongName);
        artistNameTextView.setText(incomingArtistName);

    }
}
