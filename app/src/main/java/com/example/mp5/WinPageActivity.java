package com.example.mp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinPageActivity extends GamePageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winpage);

        String winnerLabel;

        if (player1Points > player2Points) {
            winnerLabel = "Player 1 Wins!";
            TextView setWinnerLabel = (TextView) findViewById(R.id.winnerLabel);
            setWinnerLabel.setText(winnerLabel);
        } else if (player2Points > player1Points) {
            winnerLabel = "Player 2 Wins!";
            TextView setWinnerLabel = (TextView) findViewById(R.id.winnerLabel);
            setWinnerLabel.setText(winnerLabel);
        } else {
            winnerLabel = "You Win!";
            TextView setWinnerLabel = (TextView) findViewById(R.id.winnerLabel);
            setWinnerLabel.setText(winnerLabel);
        }

        String player1Label = "Player 1: " + player1Points.toString();
        TextView setPlayer1Label = (TextView) findViewById(R.id.player1PointsLabel);
        setPlayer1Label.setText(player1Label);

        String player2Label = "Player 2: " + player2Points.toString();
        TextView setPlayer2Label = (TextView) findViewById(R.id.player2PointsLabel);
        setPlayer2Label.setText(player2Label);

        configureRestartButton();

    }

    public void configureRestartButton() {
        Button restartButton = (Button) findViewById(R.id.restartButton);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WinPageActivity.this, MainActivity.class));

            }
        });
    }
}
