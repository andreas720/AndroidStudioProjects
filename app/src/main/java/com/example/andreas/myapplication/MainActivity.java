package com.example.andreas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe (View view){
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this,"Hello Toast",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe (View view){
        // get the text view
        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        // get the value of the TextView
        String countString = showCountTextView.getText().toString();

        // convert value to int and increment by one
        Integer count = Integer.parseInt(countString);
        count++;

        // show the new value in the text view
        showCountTextView.setText(count.toString());
    }

    public void randomMe (View view) {
        // create an intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);



        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);

        // start the new activity
        startActivity(randomIntent);
    }
}
