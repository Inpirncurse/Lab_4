package com.example.inpir.lab_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.telephony.SmsManager;

public class SmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Button SmsB =(Button)findViewById(R.id.button_sms);
        SmsB.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();

                smsManager.sendTextMessage("00000000", null, "Hello Phone", null, null);
                Toast.makeText(getApplicationContext(), "SMS Sent", Toast.LENGTH_SHORT).show();
            }
        });

        Button back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicio = new Intent(SmsActivity.this, MainActivity.class);
                startActivity(inicio);
            }
        });
    }
}