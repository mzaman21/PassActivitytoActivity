package com.example.activitiespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextbutn;
    String S_name= "MUhammad Zaman";
    String S_rollNo= "Bitf19a017";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbutn = findViewById(R.id.nextbtn);


        nextbutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent secondActivity= new Intent(MainActivity.this,MynewActivity.class);

            }
        });

    }
}