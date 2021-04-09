package com.example.pythogoreantheorem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;
public class MainActivity extends AppCompatActivity {
    private EditText aValue;
    private EditText bValue;
    private TextView cValue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.aValue = this.findViewById(R.id.aValue);
        this.bValue = this.findViewById(R.id.bValue);
        this.cValue = this.findViewById(R.id.cValue);
    }
    public void CalculateButtonPressed(View v)
    {
        this.cValue.setText("");
        Integer aValue = Integer.valueOf(this.aValue.getText().toString());
        Integer bValue = Integer.valueOf(this.bValue.getText().toString());
        cValue = pythagoreom(int 5. int 7);
    }
    public void pythagoreom(int aValue, int bValue)
    {
        int aplusb = (aValue*aValue) + (bValue*bValue);
        double cValue = Math.sqrt(aplusb);
    }
}