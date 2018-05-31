package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays a score of 3 when +3 is clicked
     */
    public void threePointsForTeamA(View view){
        displayForTeamA(3);
    }

    /**
     * Displays a score of 2 when +2 is clicked
     */
    public void twoPointsForTeamA(View view){
        displayForTeamA(2);
    }

    /**
     * Displays a score of 1 when free throw is clicked
     */
    public void onePointForTeamA(View view){
        displayForTeamA(1);
    }
}
