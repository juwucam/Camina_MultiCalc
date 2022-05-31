package com.example.multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassFormula extends AppCompatActivity implements View.OnClickListener{
    EditText MForce, MAcceleration;
    Button btnCalcMass;
    TextView MResult;

    Formulas Formulas = new Formulas();
    Components Components = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_formula);

        MForce = findViewById(R.id.editTextMForce);
        MAcceleration = findViewById(R.id.editTextMAcceleration);
        btnCalcMass = findViewById(R.id.btnCalcMass);
        MResult = findViewById(R.id.MResult);

        btnCalcMass.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcMass:
                Components.setMforce(Double.parseDouble(MForce.getText().toString()));
                Components.setMacceleration(Double.parseDouble(MAcceleration.getText().toString()));
                double result = Formulas.MassFormula(Components.getMforce(), Components.getMacceleration());
                MResult.setText("" + result);
                break;
        }

    }
}