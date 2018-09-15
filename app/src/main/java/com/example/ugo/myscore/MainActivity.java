package com.example.ugo.myscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //List of variables required
    int arsGoal = 0;
    int arsOff = 0;
    int arsCorner = 0;
    int arsPossession;
    int manGoal = 0;
    int manOff = 0;
    int manCorner = 0;
    int manPossession;
    int possessionTotal = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method to add a goal if Arsenal scores
    public void arsenalGoal(View view) {
        arsGoal = arsGoal + 1;
        displayForArsGoal(arsGoal);
    }
    //method to record each time there's an Arsenal offside
    public void arsenalOff(View view) {
        arsOff = arsOff + 1;
        displayForArsOff(arsOff);
    }
    //method to kep track of Arsenal corner kicks
    public void arsenalCorner(View view) {
        arsCorner = arsCorner + 1;
        displayForArsCorner(arsCorner);
    }
    //method to keep track of Arsenal possession
    public void arsenalPossession(View view) {
        arsPossession = arsPossession + 10;
        displayForArsPossession(arsPossession);
    }
    //method to add a goal if Manchester United scores
    public void manGoal(View view) {
        manGoal = manGoal + 1;
        displayForManGoal(manGoal);
    }
    //method to record each time there's a Manchester United offside
    public void manOff(View view) {
        manOff = manOff + 1;
        displayForManOff(manOff);
    }
    //method to keep track of Manchester United corner kicks
    public void manCorner(View view) {
        manCorner = manCorner + 1;
        displayForManCorner(manCorner);
    }
    //method to keep track of Manchester United possession
    public void manPossession(View view) {
        manPossession = manPossession + 10;
        displayForManPossession(manPossession);
    }
    //method to display corresponding Arsenal score
    private void displayForArsGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ars_goal);
        scoreView.setText(String.valueOf(score));
    }
    //method to display corresponding Arsenal offside
    private void displayForArsOff(int score) {
        TextView offView = (TextView) findViewById(R.id.ars_off);
        offView.setText(String.valueOf(score));
    }
    //method to display Arsenal corner kicks
    private void displayForArsCorner(int score) {
        TextView cornerView = (TextView) findViewById(R.id.ars_corner);
        cornerView.setText(String.valueOf(score));
    }
    //method to display Arsenal's possession
    private void displayForArsPossession(int score) {
        TextView posView = (TextView) findViewById(R.id.ars_pos);
        posView.setText(String.valueOf(score));
    }
    //method to display corresponding Manchester United score
    private void displayForManGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_goal);
        scoreView.setText(String.valueOf(score));
    }
    //method to display corresponding Manchester United offside
    private void displayForManOff(int score) {
        TextView offView = (TextView) findViewById(R.id.man_off);
        offView.setText(String.valueOf(score));
    }
    //method to display Manchester United corner kicks
    private void displayForManCorner(int score) {
        TextView cornerView = (TextView) findViewById(R.id.man_corner);
        cornerView.setText(String.valueOf(score));
    }
    //method to display Manchester United's possession
    private void displayForManPossession(int score) {
        TextView posView = (TextView) findViewById(R.id.man_pos);
        posView.setText(String.valueOf(score));
    }
    //method to reset all scores and numbers to zero
    public void reset(View view) {
        arsGoal = 0;
        arsOff = 0;
        arsCorner = 0;
        arsPossession = 0;
        manGoal = 0;
        manOff = 0;
        manCorner = 0;
        manPossession = 0;
        displayForArsGoal(0);
        displayForArsOff(0);
        displayForArsCorner(0);
        displayForArsPossession(0);
        displayForManGoal(0);
        displayForManOff(0);
        displayForManCorner(0);
        displayForManPossession(0);


    }


}
