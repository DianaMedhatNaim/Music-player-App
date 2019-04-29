package com.example.diana.musicplayerapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class songAdapter extends ArrayAdapter<song> {
    private Context mContext;

    /* ListView item to inflate */
    private View mListView;
    /* Current object either song or snger */
    private song mCurrentItem;
    /**
     * Identifier for artist list or song list
     * i.e  1 : It's ArabicAlbum list
     * 2 :It's EnglishAlbum list
     */
    private int mIdentifier;
    public songAdapter(@NonNull Context context, @NonNull List<song> songList, int identifier) {
        super(context, 0, songList);
        mContext = context;
        mIdentifier = identifier; }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        mListView = convertView;
        if (mListView == null) {
            mListView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false); }
        // Get the current position
        mCurrentItem = getItem(position);
        switch (mIdentifier) {
            case 1:
                // Use list item layout to display song and singer name
                displayTrack();break;
            case 2:
                // Use list item layout to display singer detail
                displayArtist();break; }return mListView; }
    // Display the song name, singer name
    private void displayTrack() {
        // Find the TextView for displaying track name from song_detail_list_item.xml and set the text
        TextView trackNameTextView = mListView.findViewById(R.id.تملي_معاك);
        trackNameTextView.setText(mCurrentItem.getDefaultSong().toString());

        // Find the textView for track artist name from song_detail_list_item.xml and set the text
        TextView trackArtistTextView = mListView.findViewById(R.id.عمرودياب);
        trackArtistTextView.setVisibility(View.VISIBLE);
        trackArtistTextView.setText(mCurrentItem.getSinger().toString()); }
    // Display the name of song and name of singer
    private void displayArtist() {
        // Find the TextView for displaying artist name from song_detail_list_item.xml and set the text
        TextView trackNameTextView = mListView.findViewById(R.id.عمرودياب);
        trackNameTextView.setText(mCurrentItem.getSinger().toString());
        trackNameTextView.setTextSize(16);
        // Find the other TextView and set visibility to GONE,
        // because we only need singer name
        TextView textView = mListView.findViewById(R.id.تملي_معاك);
        textView.setVisibility(View.GONE);}}


