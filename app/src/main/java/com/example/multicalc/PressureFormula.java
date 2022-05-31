package com.example.multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PressureFormula extends AppCompatActivity implements View.OnClickListener{
    EditText PForce, PArea;
    Button btnCalcPressure;
    TextView PResult;

    Formulas Formulas = new Formulas();
    Components Components = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_formula);

        PForce = findViewById(R.id.editTextPForce);
        PArea = findViewById(R.id.editTextPArea);
        btnCalcPressure = findViewById(R.id.btnCalcPressure);
        PResult = findViewById(R.id.PResult);

        btnCalcPressure.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcMass:
                Components.setPforce(Double.parseDouble(PForce.getText().toString()));
                Components.setArea(Double.parseDouble(PArea.getText().toString()));
                double result = Formulas.PressureFormula(Components.getPforce(), Components.getArea());
                PResult.setText("" + result);
                break;
        }
    }
}