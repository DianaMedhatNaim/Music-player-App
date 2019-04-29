package com.example.diana.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class EnglishAlbum extends AppCompatActivity {
    private static final int IDENTIFIER = 2;
    private ArrayList<song> songs;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
        getSupportActionBar().setElevation(0);
        View header = View.inflate(this, R.layout.header, null);
        songs = new ArrayList<>();
        songs.add(new song("Ka-Ching","Shanaia Twain")) ;
        songs.add(new song("Those Were the days", "Mary Hopkin"));
        songs.add(new song("Read all about it", "Emeli Sande"));
        songs.add(new song("Lemon tree", "Fools Garden"));
        songs.add(new song("Fight song", "Rachel Platten"));
        songs.add(new song("See you again", "Wiz Khalifa"));
        songs.add(new song("Feeling Good", "Michael Buble"));
        songs.add(new song("Happy", "Pharrell Williams"));
        songs.add(new song("Can't Stop the feeling", "Justin Timberlake"));
        songs.add(new song("Thunder", "Imagine Dragons"));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(header);
        songAdapter itemsadapter = new songAdapter(this, songs, IDENTIFIER);
        listView.setAdapter(itemsadapter);
        // Attach listener on list item view to play a song when clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create a new Intent to {@link PlayingSongActivity}
                Intent intent = new Intent(EnglishAlbum.this, nowPlaying.class);
                // Get the detail of song at which user has clicked
                song positions = songs.get(position - 1);
                /**
                 * Create a Bundle and put all the track related data
                 * into Bundle in (key, value) pair
                 * */
                Bundle bundle = new Bundle();
                bundle.putString("song_name", positions.getDefaultSong());
                bundle.putString("artist_name", positions.getSinger());
                // Send bundle through Intent
                intent.putExtras(bundle);
                // Start activity
                startActivity(intent);}});}
    /***
     * Implement functionality of starting a new intent for going back to
     * {@link MainActivity} when user clicks the back button in action bar
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(EnglishAlbum.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed(); }
    public void Order(View view) {
        Intent numbersIntent = new Intent(EnglishAlbum.this, ArabicAlbum.class);
        // Start the new activity
        startActivity(numbersIntent);}}