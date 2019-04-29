package com.example.diana.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class ArabicAlbum extends AppCompatActivity {
    private static final int IDENTIFIER = 1;
    private ArrayList<song> songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
        getSupportActionBar().setElevation(0);
        View header = View.inflate(this, R.layout.header, null);
        songs = new ArrayList<>();
        songs.add(new song("تملي معاك","عمرو دياب")) ;
        songs.add(new song("نسيت","محمد حماقي "));
        songs.add(new song("يونس", "محمد منير"));
        songs.add(new song("سهر الليالي", "فيروز " ));
        songs.add(new song("اعطني الناي",  "فيروز"));
        songs.add(new song("اه يا اسمراني اللون", "محمد منير"));
        songs.add(new song("الليله يا سمره", "محمد منير"));
        songs.add(new song("معاك قلبي", "عمرو دياب"));
        songs.add(new song("العالم الله", "عمرو دياب"));
        songs.add(new song("ثلاث دقات", "ابو"));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(header);
        songAdapter itemsadapter = new songAdapter(this, songs, IDENTIFIER);
        listView.setAdapter(itemsadapter);
        // Attach listener on list item view to play a song when clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create a new Intent to {@link PlayingSongActivity}
                Intent intent = new Intent(ArabicAlbum.this, nowPlaying.class);
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
        Intent intent = new Intent(ArabicAlbum.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();}
    public void Order(View view) {
        Intent numbersIntent = new Intent(ArabicAlbum.this, EnglishAlbum.class);
        // Start the new activity
        startActivity(numbersIntent);}}