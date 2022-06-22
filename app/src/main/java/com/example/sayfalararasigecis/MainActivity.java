package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonGotoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGotoB=findViewById(R.id.buttonGotoB);
        buttonGotoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeniIntent =new Intent(MainActivity.this,ActivityB.class);
                startActivity(yeniIntent);
            }
        });
    }
}