package com.example.gomezmusicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter {

    /**
     * Constructor
     *
     * @param context  The current context.
     */
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
}
