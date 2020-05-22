package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.Nullable;

public class MainActivity extends AppCompatActivity {
    private Intent myintent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myintent = new Intent(this, List_Activity.class);
        new Thread(new Runnable() {
            public void run() {
                try { Thread.sleep(2000); }
                catch (InterruptedException e) { e.printStackTrace(); }
                startActivity(myintent);
                finish();
            }
        }).start();
    }

}
