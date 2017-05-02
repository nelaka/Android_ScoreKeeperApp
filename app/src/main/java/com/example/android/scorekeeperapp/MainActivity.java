package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the points for Team 1
    int pointsTeam1 = 0;

    // Tracks the points for Team 2
    int pointsTeam2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team 1 by 1 point.
     */
    public void addPointToTeam1(View v) {
        pointsTeam1 += 1;
        displayPointsForTeam1(pointsTeam1);
    }

    /**
     * Decrease the score for Team 1 by 1 point.
     */
    public void removePointFromTeam1(View v) {
        pointsTeam1 -= 1;
        displayPointsForTeam1(pointsTeam1);
    }

    /**
     * Increase the score for Team 2 by 1 point.
     */
    public void addPointToTeam2(View v) {
        pointsTeam2 += 1;
        displayPointsForTeam2(pointsTeam2);
    }

    /**
     * Decrease the score for Team 2 by 1 point.
     */
    public void removePointFromTeam2(View v) {
        pointsTeam2 -= 1;
        displayPointsForTeam2(pointsTeam2);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        pointsTeam1 = 0;
        pointsTeam2 = 0;
        displayPointsForTeam1(pointsTeam1);
        displayPointsForTeam2(pointsTeam2);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayPointsForTeam1(int points) {
        TextView Team1score = (TextView) findViewById(R.id.pointsTeam1);
        Team1score.setText(String.valueOf(points));
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayPointsForTeam2(int points) {
        TextView Team2score = (TextView) findViewById(R.id.pointsTeam2);
        Team2score.setText(String.valueOf(points));
    }


}
