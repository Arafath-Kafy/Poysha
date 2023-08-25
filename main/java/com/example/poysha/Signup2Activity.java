package com.example.poysha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Signup2Activity extends AppCompatActivity {

    Button verifybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        verifybutton = findViewById(R.id.button2);
        verifybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(Signup2Activity.this, signup3Activity.class));
            }
        });
    }
}