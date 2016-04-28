package com.example.deepak.vshare;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AddMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    EditText mname = (EditText)findViewById(R.id.AM1);
    public void addnewGame (View view){
        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eedit = preferences.edit();
        int k = preferences.getInt("Gno",0);
        String Gamename = mname.getText().toString();
        String Egame = preferences.getString("MovieName",null);
        StringBuilder sb = new StringBuilder();
        sb.append(Gamename).append(",").append(Egame).append(",");
        eedit.putString("MovieName", sb.toString());
        eedit.apply();
    }

}
