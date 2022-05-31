package com.example.multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SpeedFormula extends AppCompatActivity implements View.OnClickListener {
    EditText Distance, Time;
    Button btnCalcSpeed;
    TextView SResult;

    Formulas Formulas = new Formulas();
    Components Components = new Components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_formula);

        Distance = findViewById(R.id.editTextSDistance);
        Time = findViewById(R.id.editTextSTime);
        btnCalcSpeed = findViewById(R.id.btnCalcSpeed);
        SResult = findViewById(R.id.SResult);

        btnCalcSpeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcSpeed:
                Components.setDistance(Double.parseDouble(Distance.getText().toString()));
                Components.setTime(Double.parseDouble(Time.getText().toString()));
                double result = Formulas.SpeedFormula(Components.getDistance(), Components.getTime());
                SResult.setText(""+ result);
                break;
        }

    }
}