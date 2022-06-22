package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {
    private Button buttonGotoMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        buttonGotoMain =findViewById(R.id.buttonGotoMain);
        buttonGotoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent yeniIntent =new Intent(ActivityC.this,MainActivity.class);
                    startActivity(yeniIntent);
            }
        });
    }
}