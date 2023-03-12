package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button cmdMenu;
    Button cmdStartNature;
    Button cmdStartOcean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cmdMenu = (Button) findViewById(R.id.buttonMenuMain);
        cmdMenu.setOnClickListener(this);
        cmdStartNature = (Button) findViewById(R.id.buttonNature);
        cmdStartNature.setOnClickListener(this);
        cmdStartOcean = (Button) findViewById(R.id.buttonOcean);
        cmdStartOcean.setOnClickListener(this);

    }

    @Override
    protected void onStart()
    { super.onStart();

    }

    public void onClick(View v) {

        if (cmdMenu.getId() == v.getId()) {
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }

        if (cmdStartNature.getId() == v.getId()) {
            Intent intent = new Intent(this, Meditation.class);
            Bundle bundle = new Bundle();
            bundle.putString("theme","nature");
            intent.putExtras(bundle);
            startActivity(intent);
        }

        if (cmdStartOcean.getId() == v.getId()) {
            Intent intent = new Intent(this, Meditation.class);
            Bundle bundle = new Bundle();
            bundle.putString("theme","ocean");
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

}