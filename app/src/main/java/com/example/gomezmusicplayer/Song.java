package com.example.gomezmusicplayer;

public class Song {

    /** Song title */
    private String mSongTitle;

    /** Song artist */
    private String mSongArtist;

    /** Resource ID for album cover image */
    private int mImageResourceID;

    /**
     * Public constructor to create a new Song object
     *
     * @param songTitle Title of the song
     * @param songArtist Artist of the song
     * @param imageResourceId Resource ID for the Album Cover
     */
    public Song(String songTitle, String songArtist, int imageResourceId) {

        mSongTitle = songTitle;

        mSongArtist = songArtist;

        mImageResourceID = imageResourceId;

    }

    

}
