package com.example.csc250_threadexample;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MyThread extends Thread
{
    TextView numberOutputTV;
    public MyThread(TextView numberOutputTv)
    {
        this.numberOutputTV = numberOutputTv;
    }

    public void run()
    {
        try
        {
            while(true)
            {
                Random r = new Random();
                this.numberOutputTV.setText(""+r.nextInt(1000));
                Thread.sleep(r.nextInt(2000)+50);

            }
            
        }
        catch(Exception e)
        {

        }

    }
}
