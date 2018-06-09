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

    /**
     *
     * @return Song title
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     *
     * @return Artist name
     */
    public String getSongArtist() {
        return mSongArtist;
    }

    /**
     *
     * @return Resource ID for album cover
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

}
