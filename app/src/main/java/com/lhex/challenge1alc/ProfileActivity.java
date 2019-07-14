package com.lhex.challenge1alc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CircleImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        toolbar = findViewById(R.id.toolbar_profile);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.title_activity_profile);
        imageView = findViewById(R.id.image_view);

        Glide.with(this).load(R.drawable.alc_pic_profile).into(imageView);
    }
    public void profileMainActivityBackArrow(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
