package com.berbagi.berbagi3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view) {
        Intent profile= new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profile);
    }

    public void about(View view) {
        Intent about= new Intent(MainActivity.this, AboutActivity.class);
        startActivity(about);
    }

    public void help(View view) {
        Intent help= new Intent(MainActivity.this, HelpActivity.class);
        startActivity(help);
    }

    public void kampanye(View view) {
        Intent kampanye= new Intent(MainActivity.this, CampaignActivity.class);
        startActivity(kampanye);
    }

    public void add(View view) {
        Intent add= new Intent(MainActivity.this, TambahActivity.class);
        startActivity(add);
    }
}
