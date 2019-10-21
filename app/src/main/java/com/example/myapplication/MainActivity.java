package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSolve(View v) {
        EditText strA = findViewById(R.id.editText2);
        String sA = strA.getText().toString();
        int a = Integer.parseInt(sA);
        EditText strB = findViewById(R.id.editText3);
        String sB = strB.getText().toString();
        int b = Integer.parseInt(sB);
        EditText strC = findViewById(R.id.editText5);
        String sC = strC.getText().toString();
        int c = Integer.parseInt(sC);
        // логика расчета

        TextView res = findViewById(R.id.textView6);
        if(92348234) {
            res.setText("Решение" + x1 + " " + x2);
        }

    }
}
