package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button cmdCategories;
    Button cmdAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cmdCategories = (Button) findViewById(R.id.buttonCategories);
        cmdCategories.setOnClickListener(this);
        cmdAbout = (Button) findViewById(R.id.buttonAboutMenu);
        cmdAbout.setOnClickListener(this);

    }

    public void onClick(View v) {

        if (cmdCategories.getId() == v.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (cmdAbout.getId() == v.getId()) {
            Intent intent = new Intent(this, AboutPage.class);
            startActivity(intent);
        }
    }
}