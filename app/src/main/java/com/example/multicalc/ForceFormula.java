package com.example.multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForceFormula extends AppCompatActivity implements View.OnClickListener{
    EditText FMass, FAcceleration;
    Button btnCalcForce;
    TextView FResult;

    Formulas Formulas = new Formulas();
    Components Components = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_formula);

        FMass = findViewById(R.id.editTextFMass);
        FAcceleration = findViewById(R.id.editTextFAcceleration);
        btnCalcForce = findViewById(R.id.btnCalcForce);
        FResult = findViewById(R.id.FResult);

        btnCalcForce.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcForce:
                Components.setFmass(Double.parseDouble(FMass.getText().toString()));
                Components.setFacceleration(Double.parseDouble(FAcceleration.getText().toString()));
                double result = Formulas.ForceFormula(Components.getFmass(), Components.getFacceleration());
                FResult.setText("" + result);
                break;
        }
    }
}