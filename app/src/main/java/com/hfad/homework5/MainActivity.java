package com.hfad.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Double Result = 0.0, Num1 = 0.0, Num2 = 0.0;
    String Calc = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setting Up Buttons
        //------------------------------------------------
        //Row 1
        Button Clear = (Button) findViewById(R.id.btnClear);
        Button ChangeSign = (Button) findViewById(R.id.btnChangeSign);
        Button Percent = (Button) findViewById(R.id.btnPercent);
        Button Divide = (Button) findViewById(R.id.btnDivide);
        //Row 2
        Button Seven = (Button) findViewById(R.id.btnSeven);
        Button Eight = (Button) findViewById(R.id.btnEight);
        Button Nine = (Button) findViewById(R.id.btnNine);
        Button Multiply = (Button) findViewById(R.id.btnMulti);
        //Row 3
        Button Four = (Button) findViewById(R.id.btnFour);
        Button Five = (Button) findViewById(R.id.btnFive);
        Button Six = (Button) findViewById(R.id.btnSix);
        Button Minus = (Button) findViewById(R.id.btnMinus);
        //Row 4
        Button One = (Button) findViewById(R.id.btnOne);
        Button Two = (Button) findViewById(R.id.btnTwo);
        Button Three = (Button) findViewById(R.id.btnThree);
        Button Plus = (Button) findViewById(R.id.btnPlus);
        //Row 5
        Button Zero = (Button) findViewById(R.id.btnZero);
        Button Period = (Button) findViewById(R.id.btnPeriod);
        Button Equals = (Button) findViewById(R.id.btnEquals);

        TextView output = (TextView) findViewById(R.id.calcView);

        //Button Calculations
        //-------------------------------------------------
        //Row 1
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = 0.0;
                Num1 = 0.0;
                Num2 = 0.0;
                output.setText("0");
            }
        });
        ChangeSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat format = new DecimalFormat("0.#");
                Double Num = Double.parseDouble(output.getText().toString());
                if (Num > 0) {
                    Num = -Math.abs(Num);
                } else {
                    Num = Math.abs(Num);
                }
                output.setText(format.format(Num));
            }
        });

        Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Num = Double.parseDouble(output.getText().toString());
                Num = Num / 100;
                output.setText(Double.toString(Num));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc = "Divide";
                Num2 = Double.parseDouble(output.getText().toString());
                output.setText(" ");
            }
        });

        //Row Two
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("7");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "7";
                    output.setText(Num);
                }
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("8");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "8";
                    output.setText(Num);
                }
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("9");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "9";
                    output.setText(Num);
                }
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc = "Multiply";
                Num2 = Double.parseDouble(output.getText().toString());
                output.setText(" ");
            }
        });


        //Row 3
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("4");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "4";
                    output.setText(Num);
                }
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("5");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "5";
                    output.setText(Num);
                }
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("6");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "6";
                    output.setText(Num);
                }
            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc = "Minus";
                Num2 = Double.parseDouble(output.getText().toString());
                output.setText(" ");
            }
        });

        //Row 4
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("1");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "1";
                    output.setText(Num);
                }
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("2");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "2";
                    output.setText(Num);
                }
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output.getText().toString().equals("0")){
                    output.setText("3");
                }
                else {
                    String Num = output.getText().toString();
                    Num = Num + "3";
                    output.setText(Num);
                }
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc = "Plus";
                Num2 = Double.parseDouble(output.getText().toString());
                output.setText(" ");
            }
        });

        //Row 5
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Num = output.getText().toString();
                Num = Num + "0";
                output.setText(Num);
            }
        });
        Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat format = new DecimalFormat("0.#");
                if (Calc.equals("Divide")) {
                    Num1 = Double.parseDouble(output.getText().toString());
                    Result = Num2 / Num1;
                    output.setText(format.format(Result));
                    Calc = " ";
                }
                else if (Calc.equals("Multiply")) {
                    Num1 = Double.parseDouble(output.getText().toString());
                    Result = Num2 * Num1;
                    output.setText(format.format(Result));
                    Calc = " ";
                }
                else if (Calc.equals("Minus")){
                    Num1 = Double.parseDouble(output.getText().toString());
                    Result = Num2 - Num1;
                    output.setText(format.format(Result));
                    Calc = " ";
                }
                else if (Calc.equals("Plus")){
                    Num1 = Double.parseDouble(output.getText().toString());
                    Result = Num2 + Num1;
                    output.setText(format.format(Result));
                    Calc = " ";
                }
                else{
                    Calc = " ";
                }

            }
        });
    }
}