package com.example.activitiespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MynewActivity extends AppCompatActivity {

    String StudentName,StudentRollNo;
    TextView Name,RollNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynew);

        Name= findViewById(R.id.Sname);
        RollNo=findViewById(R.id.Srollno);




    }
}