package com.example.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView textView=(TextView)findViewById(R.id.joke_text);
  Intent intent=getIntent();
        String joke=intent.getStringExtra("joke");
        textView.setText(joke);
    }
}
