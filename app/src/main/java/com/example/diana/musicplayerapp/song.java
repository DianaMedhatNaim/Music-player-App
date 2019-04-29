package com.example.diana.musicplayerapp;

public class song {
    private String mDefaultsong;
    private String mSinger;
    private String malbum;
    /**
     * Create a new song.
     * @param songName is the name of the song
     * @param singerName is the name of the song
     */
    public song (String songName, String singerName) {
        mDefaultsong = songName;
        mSinger = singerName; }
    public song (String songName, String singerName,String Albumname) {
        mDefaultsong = songName;
        mSinger = singerName;
        malbum=Albumname;}
    /**
     * Get the default song
     */
    public String getDefaultSong() {
        return mDefaultsong;
    }
    /**
     * Get the the singer name.
     */
    public String getSinger() {
        return mSinger;
    }
    public String getalbum() {
        return malbum;}}



