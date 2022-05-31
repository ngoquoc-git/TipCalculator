package com.example.lab1_tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab1_tipcalculator.TipCalculator;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TipCalculator tipCalc;
    public NumberFormat money = NumberFormat.getCurrencyInstance();
    private EditText billEditText;
    private EditText tipEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tipCalc = new TipCalculator( 0.17f, 100.0f );
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {
        billEditText = (EditText) findViewById(R.id.amount_bill);
        tipEditText = ___________________________________________
        String billString = billEditText.getText().toString();
        String tipString = _____________________________________
        TextView tipTextView = (TextView) findViewById(R.id.amount_tip);
        TextView totalTextView =__________________________________________
        try {
            // convert billString and tipString to floats
            float billAmount = Float.parseFloat(billString);
            int tipPercent = _____________________________
            // update the Model
            tipCalc.setBill(___________________);
            tipCalc.setTip(.01f * tipPercent);
            // ask Model to calculate tip and total amounts
            float tip = _______________________
            float total = _____________________
            // update the View with formatted tip and total amounts
            tipTextView.setText(money.format(tip));
            ______________________________________
        } catch (NumberFormatException nfe) {
            // pop up an alert view here (optional)
        }
    }
}