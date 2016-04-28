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

public class AddTVseries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tvseries);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    EditText tvname = (EditText)findViewById(R.id.ATV1);
    public void addnewTV (View view){
        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eedit = preferences.edit();
        String Gamename = tvname.getText().toString();
        String Egame = preferences.getString("TVName",null);
        StringBuilder sb = new StringBuilder();
        sb.append(Gamename).append(",").append(Egame).append(",");
        eedit.putString("TVName", sb.toString());
        eedit.apply();
    }

}
