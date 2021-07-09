package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int scoreA=0;
    static int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
    }
    public void apointa(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreA=scoreA+3;
        scoreView.setText(String.valueOf(scoreA));
    }
    public void apointb(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreA=scoreA+2;
        scoreView.setText(String.valueOf(scoreA));
    }
    public void apointc(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreA=scoreA+1;
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void bpointa(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreB=scoreB+3;
        scoreView.setText(String.valueOf(scoreB));
    }
    public void bpointb(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreB=scoreB+2;
        scoreView.setText(String.valueOf(scoreB));
    }
    public void bpointc(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreB=scoreB+1;
        scoreView.setText(String.valueOf(scoreB));
    }
    public void reset(View view) {
        TextView scoreViewa = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreA=0;
        scoreB=0;
        scoreViewa.setText(String.valueOf(scoreA));
        scoreViewb.setText(String.valueOf(scoreB));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}