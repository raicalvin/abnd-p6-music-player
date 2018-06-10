package com.example.gomezmusicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

public class SongAdapter extends ArrayAdapter {

    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     */
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
}
