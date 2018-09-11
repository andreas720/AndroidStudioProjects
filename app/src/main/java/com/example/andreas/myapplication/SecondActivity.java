package com.example.andreas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        showRandomNumber();
    }

    public void showRandomNumber() {

        //get the text view where the random number will be displayed
        TextView randomView = (TextView) findViewById(R.id.textview_random);

        //get the text view where heading is displayed
        TextView headingView = (TextView) findViewById(R.id.textview_label);

        //get count from the intent extras
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        //generate random number
        Random random = new Random();
        int randomInt = 0;
        if (count > 0) {
            randomInt = random.nextInt(count);
        }

        // display the random number
        randomView.setText(Integer.toString(randomInt));

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        headingView.setText(getString(R.string.random_heading, count));
    }
}
