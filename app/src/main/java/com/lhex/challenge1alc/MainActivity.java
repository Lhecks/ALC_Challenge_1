package com.lhex.challenge1alc;

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

    public void profileButton(View view){
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    public void aboutButton(View view){
        startActivity(new Intent(this, AboutActivity.class));
    }
}
