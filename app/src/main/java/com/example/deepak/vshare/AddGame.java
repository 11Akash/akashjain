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

public class AddGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    EditText gname = (EditText)findViewById(R.id.AG1);
    public void addnewGame (View view){
        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eedit = preferences.edit();
        String Gamename = gname.getText().toString();
        String Egame = preferences.getString("GameName","No Name");
        StringBuilder sb = new StringBuilder();
        String pnew = sb.append(Gamename).append(",").append(Egame).append(",").toString();
        eedit.putString("GameName",pnew );
        eedit.apply();
    }

}
