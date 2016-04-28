package com.example.deepak.vshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddDATA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void addmovie(View view){
        Intent intent = new Intent(this,AddMovie.class);
        startActivity(intent);
    }
    public void addgame(View view){
        Intent intent = new Intent(this,AddGame.class);
        startActivity(intent);
    }
    public void addtvseries(View view){
        Intent intent = new Intent(this,AddTVseries.class);
        startActivity(intent);
    }
    

}
