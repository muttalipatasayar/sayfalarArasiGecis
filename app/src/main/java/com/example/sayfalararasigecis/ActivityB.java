package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {
    private Button buttonGotoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        buttonGotoC = findViewById(R.id.buttonGotoC);
        buttonGotoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeniIntent= new Intent(ActivityB.this,ActivityC.class);
                startActivity(yeniIntent);
            }
        });
    }
}