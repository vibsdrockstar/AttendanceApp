package com.example.vibhor.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
    }


    public void getStatistics(View v)
    {
        EditText subject = (EditText) findViewById(R.id.subject1);

        EditText week1 = (EditText) findViewById(R.id.sub1a1);
        EditText week2 = (EditText) findViewById(R.id.sub1a2);
        EditText week3 = (EditText) findViewById(R.id.sub1a3);
        EditText week4 = (EditText) findViewById(R.id.sub1a4);

        TextView textOut = (TextView) findViewById(R.id.outputText);

        int a1 = Integer.valueOf(week1.getText().toString());
        int a2 = Integer.valueOf(week2.getText().toString());
        int a3 = Integer.valueOf(week3.getText().toString());
        int a4 = Integer.valueOf(week4.getText().toString());


        int totalAttended = a1+a2+a3+a4;
        int totalClasses = 20;

        float percentageAttendance = 100.0F*(float)totalAttended/20.0F;

        if(percentageAttendance<75.0F)
        {
            String sub = subject.getText().toString();
            if(sub.length()<3) sub = "subject";
            textOut.setText("Your attendance in "+sub+" is "+percentageAttendance+"%. You should take care of it.");
        }
        else if(percentageAttendance>90.0F)
        {
            String sub = subject.getText().toString();
            if(sub.length()<3) sub = "subject";
            textOut.setText("Awesome attendance, it is "+percentageAttendance+"% in "+sub+". Bravo.");
        }
        else {
            String sub = subject.getText().toString();
            if (sub.length() < 3) sub = "subject";
            textOut.setText("You are doing well in " + sub + ". Attendance is " + percentageAttendance + "%. Good.");
        }
    }
}
