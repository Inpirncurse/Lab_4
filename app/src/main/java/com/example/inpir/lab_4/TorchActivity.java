package com.example.inpir.lab_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.hardware.Camera;

public class TorchActivity extends AppCompatActivity {

    Camera camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);

        camera = Camera.open();

        Button onButton =(Button)findViewById(R.id.button_torch);
        onButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Camera.Parameters param = camera.getParameters();
                param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(param);
                camera.startPreview();

            }
        });

        Button offButton =(Button)findViewById(R.id.buttonOff);
        offButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                camera.release();

            }
        });

        Button back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(TorchActivity.this, MainActivity.class);
                startActivity(one);
            }
        });
    }
}