package com.hfad.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private DecimalFormat format = new DecimalFormat("0.#");
    private double result = 0.0, oldNum = 0.0;
    String calc = " ";
    boolean newNum = true;
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
        output.setText("0");


        //Button Calculations
        //-------------------------------------------------

        //Row 1
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0.0;
                oldNum = 0.0;
                output.setText("0");
            }
        });

        ChangeSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat format = new DecimalFormat("0.#");
                double num = Double.parseDouble(output.getText().toString());
                if (num > 0) {
                    num = -Math.abs(num);
                } else {
                    num = Math.abs(num);
                }
                output.setText(format.format(num));
            }
        });

        Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(output.getText().toString());
                num = num / 100;
                output.setText(Double.toString(num));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc = "Divide";
                oldNum = Double.parseDouble(output.getText().toString());
                output.setText(" ");
            }
        });

        //Row Two
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "7");
                output.setText(num);
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "8");
                output.setText(num);
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "9");
                output.setText(num);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc = "Multiply";
                oldNum = Double.parseDouble(output.getText().toString());
                newNum = true;
            }
        });


        //Row 3
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "4");
                output.setText(num);
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "5");
                output.setText(num);
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "6");
                output.setText(num);
            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc = "Minus";
                oldNum = Double.parseDouble(output.getText().toString());
                newNum = true;
            }
        });

        //Row 4
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "1");
                output.setText(num);
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "2");
                output.setText(num);
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "3");
                output.setText(num);
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc = "Plus";
                oldNum = Double.parseDouble(output.getText().toString());
                newNum = true;
            }
        });

        //Row 5
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = (output.getText().toString());
                num = createNewNum(num, "0");
                output.setText(num);
            }
        });

        Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0.0;
                if (calc.equals("Divide")) {
                    num = Double.parseDouble(output.getText().toString());
                    result = oldNum / num;
                    output.setText(format.format(result));
                    calc = " ";
                }
                else if (calc.equals("Multiply")) {
                    num = Double.parseDouble(output.getText().toString());
                    result = oldNum * num;
                    output.setText(format.format(result));
                    calc = " ";
                }
                else if (calc.equals("Minus")){
                    num = Double.parseDouble(output.getText().toString());
                    result = oldNum - num;
                    output.setText(format.format(result));
                    calc = " ";
                }
                else if (calc.equals("Plus")){
                    num = Double.parseDouble(output.getText().toString());
                    result = oldNum + num;
                    output.setText(format.format(result));
                    calc = " ";
                }
                else{
                    calc = " ";
                }
            }
        });
    }
    //Method to create a New Number and then see if one is already made
    public String createNewNum(String num, String type){
        String output;
        if(newNum) {
            num = " ";
            output = addNum(num, type);
            newNum = false;
        }
        else{
            output = addNum(num, type);
        }
        return output;
    }
    //Method to add to existing number
    public String addNum(String num, String type){
        if(num.equals("0")){
            num = type;
        }
        else {
            num = num + type;
        }
        return num;
    }


}