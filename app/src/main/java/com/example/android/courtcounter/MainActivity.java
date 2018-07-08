package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Score for team A
    int scoreTeamA = 0;
    // Score for team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  Add 1 point to team a
     */
    public void freeThrowForTeamA(View view) {
        // add new point
        scoreTeamA = scoreTeamA + 1;
        // display new score to screen
        displayForTeamA(scoreTeamA);
    }

    /**
     *  Add 2 point to team a
     */
    public void twoPointsForTeamA(View view) {
        // add new point
        scoreTeamA = scoreTeamA + 2;
        // display new score to screen
        displayForTeamA(scoreTeamA);
    }

    /**
     *  Add 3 point to team a
     */
    public void threePointsForTeamA(View view) {
        // add new point
        scoreTeamA = scoreTeamA + 3;
        // display new score to screen
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
     *  Add 1 point to team b
     */
    public void freeThrowForTeamB(View view) {
        // add new point
        scoreTeamB = scoreTeamB + 1;
        // display new score to screen
        displayForTeamB(scoreTeamB);
    }

    /**
     *  Add 2 point to team b
     */
    public void twoPointsForTeamB(View view) {
        // add new point
        scoreTeamB = scoreTeamB + 2;
        // display new score to screen
        displayForTeamB(scoreTeamB);
    }

    /**
     *  Add 3 point to team b
     */
    public void threePointsForTeamB(View view) {
        // add new point
        scoreTeamB = scoreTeamB + 3;
        // display new score to screen
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
     *  Reset Score For both teams
     */
    public void resetScore(View view) {
        // reset point
        scoreTeamA = 0;
        scoreTeamB = 0;
        // display new score to screen
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
