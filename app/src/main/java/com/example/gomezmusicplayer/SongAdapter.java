package com.example.gomezmusicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SongAdapter extends ArrayAdapter {

    private Context mContext;
    private List<Song> songsList = new ArrayList<>();

    /**
     * Constructor
     *
     * @param context  The current context.
     */
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
        mContext = context;
        songsList = songs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Song song = (Song) getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.song_item,parent,false);
        }

        TextView songTitleTextView = (TextView) convertView.findViewById(R.id.song_library_text_view);
        TextView artistTitleTextView = (TextView) convertView.findViewById(R.id.artist_library_text_view);
        ImageView albumeCoverImageView = (ImageView) convertView.findViewById(R.id.library_image);

        songTitleTextView.setText(song.getSongTitle());
        artistTitleTextView.setText(song.getSongArtist());
        albumeCoverImageView.setImageResource(song.getImageResourceID());

        return convertView;
    }
}
