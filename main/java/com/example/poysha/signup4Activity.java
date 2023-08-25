package com.example.poysha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class signup4Activity extends AppCompatActivity {

    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup4);

        confirm = findViewById(R.id.button);
        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(signup4Activity.this, LoginActivity.class));
            }
        });

    }
}