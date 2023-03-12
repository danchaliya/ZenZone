package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        menu = (Button) findViewById(R.id.buttonMenuHome);

    }

}
