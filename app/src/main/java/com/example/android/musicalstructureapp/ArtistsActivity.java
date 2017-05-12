package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView artist1 = (TextView) findViewById(R.id.artist1);
        artist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist1Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist1Intent);
            }
        });

        TextView artist2 = (TextView) findViewById(R.id.artist2);
        artist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist2Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist2Intent);
            }
        });

        TextView artist3 = (TextView) findViewById(R.id.artist3);
        artist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist3Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist3Intent);
            }
        });

        TextView artist4 = (TextView) findViewById(R.id.artist4);
        artist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist4Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist4Intent);
            }
        });

        TextView artist5 = (TextView) findViewById(R.id.artist5);
        artist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist5Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist5Intent);
            }
        });

        TextView artist6 = (TextView) findViewById(R.id.artist6);
        artist6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist6Intent = new Intent(ArtistsActivity.this, ArtistActivity.class);
                startActivity(artist6Intent);
            }
        });

        //Menu Links

        TextView home = (TextView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        TextView song = (TextView) findViewById(R.id.song_button);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songIntent);
            }
        });

        TextView now = (TextView) findViewById(R.id.now_button);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}
