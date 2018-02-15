package com.example.inpir.lab_4;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button VibrationActivity = (Button) findViewById(R.id.button_vibration);
        Button SmsActivity = (Button) findViewById(R.id.button_sms);
        Button TorchActivity = (Button) findViewById(R.id.button_torch);

        VibrationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(MainActivity.this, VibrationActivity.class);
                startActivity(one);
            }
        });

        SmsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent two = new Intent(MainActivity.this, SmsActivity.class);
                startActivity(two);
            }
        });

        TorchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three = new Intent(MainActivity.this, TorchActivity.class);
                startActivity(three);
            }
        });
    }
}