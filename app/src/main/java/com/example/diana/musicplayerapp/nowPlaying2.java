package com.example.diana.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class nowPlaying2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        getSupportActionBar().setElevation(0);
        Intent intent = getIntent();
        // Get name of the song with key "song_name"
        String songName = intent.getStringExtra("song_name");
        String singerName = intent.getStringExtra("singerName");
        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);
        TextView singerNameTextView = findViewById(R.id.playing_song_artist_name);
        singerNameTextView.setText(singerName);}}