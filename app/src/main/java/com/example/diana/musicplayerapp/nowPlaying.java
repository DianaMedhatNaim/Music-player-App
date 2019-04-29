package com.example.diana.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class nowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);
        // Receive the intent send by {@link SongsActivity}
        Intent intent = getIntent();
        // Get name of the song with key "song_name"
        String songName = intent.getStringExtra("song_name");
        // Get the name of artist with key "artist_name"
        String artistName = intent.getStringExtra("artist_name");
        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);
        TextView artistNameTextView = findViewById(R.id.playing_song_artist_name);
        artistNameTextView.setText(artistName);
    }
}