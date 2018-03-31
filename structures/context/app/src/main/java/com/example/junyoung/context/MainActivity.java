package com.example.junyoung.context;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonHello = findViewById(R.id.button_main_hello);
        Button buttonGoodbye = findViewById(R.id.button_main_goodbye);
        buttonHello.setOnClickListener(this); // The keyword "this" indicates the Activity context.
        buttonGoodbye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The keyword "this" cannot be used in this case.
                // When using anonymous functions when implementing listeners, the keyword "this"
                // in Java applies to the most immediate class being declared. In these cases, the
                // outer class MainActivity has to be specified to refer to the Activity instance.
                Toast.makeText(MainActivity.this, "Goodbye!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_main_hello) {
            Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show();
        }
    }
}
