package com.example.csc250_threadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView numberOutputTV;
    private TextView nameOutputTV;
    private EditText nameET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.numberOutputTV=this.findViewById(R.id.numberOutputTV);
        this.nameOutputTV = this.findViewById(R.id.nameOutputTV);
        this.nameET = this.findViewById(R.id.nameET);
    }

    public void onPressMeButtonPressed(View v)
    {
        MyThread mt = new MyThread(this.numberOutputTV);
        MyThread mt2 = new MyThread(this.nameOutputTV);
        mt.start();
        mt2.start();

    }

    public void onSetNameButtonPressed(View v)
    {
        String name = this.nameET.getText().toString();
        this.nameOutputTV.setText(name);

    }
}