package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView NowPage = (TextView) findViewById(R.id.nowView);
        NowPage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });

        TextView artistPage = (TextView) findViewById(R.id.artistView);
        artistPage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView songPage = (TextView) findViewById(R.id.songView);
        songPage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songIntent);
            }
        });

        ImageView album1Page = (ImageView) findViewById(R.id.album1);
        album1Page.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album1Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album1Intent);
            }
        });

        ImageView album2Page = (ImageView) findViewById(R.id.album2);
        album2Page.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album2Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album2Intent);
            }
        });

        ImageView album3Page = (ImageView) findViewById(R.id.album3);
        album3Page.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album3Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album3Intent);
            }
        });

        ImageView album4Page = (ImageView) findViewById(R.id.album4);
        album4Page.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album4Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album4Intent);
            }
        });

        ImageView album5Page = (ImageView) findViewById(R.id.album5);
        album5Page.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album5Intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(album5Intent);
            }
        });
    }

}
