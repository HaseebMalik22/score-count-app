package com.example.scorecourt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void plus_three(View view) {
        scoreTeamA= scoreTeamA+ 3;
        displayForTeamA(scoreTeamA);
    }

    public void plus_two(View view) {
        scoreTeamA= scoreTeamA+ 2;
        displayForTeamA(scoreTeamA);
    }

    public void free_throw(View view) {
        scoreTeamA= scoreTeamA+ 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void plus_threeB(View view) {
        scoreTeamB= scoreTeamB+ 3;
        displayForTeamB(scoreTeamB);
    }

    public void plus_twoB(View view) {
        scoreTeamB= scoreTeamB+ 2;
        displayForTeamB(scoreTeamB);
    }

    public void free_throwB(View view) {
        scoreTeamB= scoreTeamB+ 1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}