package com.example.mp5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final MediaPlayer rightSound = MediaPlayer.create(this, R.raw.right);
    final MediaPlayer wrongSound = MediaPlayer.create(this, R.raw.wrong);
    public boolean isPlayer1 = true;

    public boolean getPlayer1() {
        return isPlayer1;
    }

    public void setPlayer1(boolean setPlayer1) {
        isPlayer1 = setPlayer1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);
        configureStartButton();
    }

    public void configureStartButton() {
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuestionPageActivity.class));

            }
        });
    }
}
