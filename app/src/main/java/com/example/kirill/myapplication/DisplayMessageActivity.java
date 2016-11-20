package com.example.kirill.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
//import java.util.Random;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);


        // Get a string resource from your app's Resources
        //String hello = getResources().getString(R.string.hello_world);

        // Or supply a string resource to a method that requires a string
        TextView textView2 = new TextView(this);
        textView2.setText(R.string.hello_world);

        layout.addView(textView2);

        /*
        Random rand;
        int max = 5;
        int min = 0;
        int randomNum = rand.nextInt((max - min) + 1) + min;
    */
        //double rand = 5 + (Math.random() * (10 - 5));
        //String hello2 = (string)rand;
        //layout.addView(hello2);
    }
}
