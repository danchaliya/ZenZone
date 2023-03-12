package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Locale;
//import freetts;

public class Meditation extends AppCompatActivity implements View.OnClickListener {

    Button cmdMenu;
    TextView Title;
    private static String PARAM_TIME;
    private static String PARAM_THEME;
    private static String PARAM_LEVEL;
    private static String[] PARAMETERS = new String[3];
    private TextToSpeech t1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        Title = (TextView) findViewById(R.id.textViewMeditName);
        cmdMenu = (Button) findViewById(R.id.buttonMenuMeditation);
        cmdMenu.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.api_response);

        Bundle bundle = getIntent().getExtras();

        String theme = bundle.getString("theme");
        Title.setText(theme + " meditation");

        String chatgpt_response = "";
        try {
            chatgpt_response = controller.get_response("hello");
        } catch (Exception e) {
            e.printStackTrace();
            chatgpt_response = "Oops!  Could not connect to our backend.  Check your internet connection!";
        }

        textView.setText(chatgpt_response);

    }

    public void onClick(View v) {

        if (cmdMenu.getId() == v.getId()) {
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }

    }

}