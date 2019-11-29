package com.kruvv.countcounter;

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

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        if (scoreTeamA >= 0) {
            scoreTeamA = scoreTeamA + 1;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 point.
     */
    public void addTwoForTeamA(View v) {
        if (scoreTeamA >= 0) {
            scoreTeamA = scoreTeamA + 2;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 point.
     */
    public void addThreeForTeamA(View v) {
        if (scoreTeamA >= 0) {
            scoreTeamA = scoreTeamA + 3;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        if (scoreTeamB >= 0) {
            scoreTeamB = scoreTeamB + 1;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        if (scoreTeamB >= 0) {
            scoreTeamB = scoreTeamB + 2;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v) {
        if (scoreTeamB >= 0) {
            scoreTeamB = scoreTeamB + 3;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given reset score Team A and Team B.
     */
    public void resetAllScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
