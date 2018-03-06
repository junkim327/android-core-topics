package com.example.junyoung.activity_lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final String TITLE_KEY = "Main_Title";

    TextView textViewTitle;
    Button button;

    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "Enters the Created state.");

        if (savedInstanceState != null) {
            Log.d(TAG, "Recovers the instance state.");

            title = savedInstanceState.getString(TITLE_KEY);
        }
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.textview_title);
        textViewTitle.setText(R.string.hello_world);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubPageActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "Re-initializes the activity from a previously saved state.");

        textViewTitle.setText(savedInstanceState.getString(TITLE_KEY));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "Retrieves per-instance state from an activity.");

        outState.putString(TITLE_KEY, "Welcome to the Activity Lifecycle guide.");

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Enters the Resumed state");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Enters the Paused state");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Enters the Stopped state");
    }
}
