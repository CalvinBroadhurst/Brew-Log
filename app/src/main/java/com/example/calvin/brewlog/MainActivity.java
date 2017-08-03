package com.example.calvin.brewlog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewBrew(View view){
        Intent intent = new Intent(MainActivity.this, StartNewBrew.class);
        startActivity(intent);
    }

    public void startNewDistillation(View view){
        Intent intent = new Intent(MainActivity.this, StartNewDistillation.class);
        startActivity(intent);
    }

    public void viewBrews(View view){
        Intent intent = new Intent(MainActivity.this, ViewBrews.class);
        startActivity(intent);
    }

    public void viewDistillations(View view){
        Intent intent = new Intent(MainActivity.this, ViewDistillations.class);
        startActivity(intent);
    }


}
