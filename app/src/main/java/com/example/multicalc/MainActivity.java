package com.example.multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMass, btnForce, btnPressure, btnSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnMass = findViewById(R.id.btnMass);
        btnForce = findViewById(R.id.btnForce);
        btnPressure = findViewById(R.id.btnPressure);
        btnSpeed = findViewById(R.id.btnSpeed);

        //clicks
        btnMass.setOnClickListener(this);
        btnForce.setOnClickListener(this);
        btnPressure.setOnClickListener(this);
        btnSpeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMass:
                Intent intent=new Intent(MainActivity.this,MassFormula.class);
                startActivity(intent);
                break;
            case R.id.btnForce:
                Intent intent1=new Intent(MainActivity.this,ForceFormula.class);
                startActivity(intent1);
                break;
            case R.id.btnPressure:
                Intent intent2=new Intent(MainActivity.this,PressureFormula.class);
                startActivity(intent2);
                break;
            case R.id.btnSpeed:
                Intent intent3=new Intent(MainActivity.this,SpeedFormula.class);
                startActivity(intent3);
                break;

    }
}