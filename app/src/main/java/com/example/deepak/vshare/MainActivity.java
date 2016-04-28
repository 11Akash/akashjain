package com.example.deepak.vshare;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences shredpref1 = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        if(!shredpref1.contains("Initialized"))
        {
            Intent intnt= new Intent (this,Signin.class);
            startActivity(intnt);
        }

    }
    public void Games (View view)
    {

        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("GameName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void movies (View view)
    {
        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("MovieName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void TVseries (View view)
    {
        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("TVName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void AddData (View view)
    {
        Intent add = new In
    }
    tent(this,AddDATA.class);
    startActivity(add);
}
