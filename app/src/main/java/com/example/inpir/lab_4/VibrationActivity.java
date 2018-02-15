package com.example.inpir.lab_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Vibrator;


public class VibrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        Button VibrationB =(Button)findViewById(R.id.button_vibrate);
        VibrationB.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //Set the pattern for vibration
                long pattern[]={0,200,100,300,400}; //or you can just set a duration also in ms
                Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
                vibrator.vibrate(pattern, -1);


            }
        });

        Button back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(VibrationActivity.this, MainActivity.class);
                startActivity(one);
            }
        });
    }

}
