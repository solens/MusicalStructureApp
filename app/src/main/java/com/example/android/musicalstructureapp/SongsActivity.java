package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView song1 = (TextView) findViewById(R.id.song1);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song1Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song1Intent);
            }
        });

        TextView song2 = (TextView) findViewById(R.id.song2);
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song2Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song2Intent);
            }
        });

        TextView song3 = (TextView) findViewById(R.id.song3);
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song3Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song3Intent);
            }
        });

        TextView song4 = (TextView) findViewById(R.id.song4);
        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song4Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song4Intent);
            }
        });

        TextView song5 = (TextView) findViewById(R.id.song5);
        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song5Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song5Intent);
            }
        });

        TextView song6 = (TextView) findViewById(R.id.song6);
        song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song6Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song6Intent);
            }
        });

        TextView song7 = (TextView) findViewById(R.id.song7);
        song7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song7Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song7Intent);
            }
        });

        TextView song8 = (TextView) findViewById(R.id.song8);
        song8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song8Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song8Intent);
            }
        });

        TextView song9 = (TextView) findViewById(R.id.song9);
        song9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song9Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song9Intent);
            }
        });

        //Menu Links

        TextView home = (TextView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist_button);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView now = (TextView) findViewById(R.id.now_button);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}
