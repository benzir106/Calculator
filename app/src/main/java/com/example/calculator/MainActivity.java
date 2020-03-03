package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, percentbutton, buttonAC, buttonEqual, dotbutton, plusminusbutton;

    private TextView textView;

    float number1, number2;

    boolean add, sub, mult, div,percent ;

    boolean decimal=false;
    boolean equalclick =false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button0 = findViewById(R.id.IdButton0);
        button1 = findViewById(R.id.IdButton1);
        button2 = findViewById(R.id.IdButton2);
        button3 = findViewById(R.id.IdButton3);
        button4 = findViewById(R.id.IdButton4);
        button5 = findViewById(R.id.IdButton5);
        button6 = findViewById(R.id.IdButton6);
        button7 = findViewById(R.id.IdButton7);
        button8 = findViewById(R.id.IdButton8);
        button9 = findViewById(R.id.IdButton9);
        plusminusbutton = findViewById(R.id.plusminusIdButton);
        buttonAdd = findViewById(R.id.addIdButton);
        buttonSub = findViewById(R.id.subIdButton);
        buttonMul = findViewById(R.id.multiplyIdButton);
        buttonDivision = findViewById(R.id.dividerIdButton);
        buttonAC = findViewById(R.id.acIdButton);
        buttonEqual = findViewById(R.id.equalIdButton);
        dotbutton = findViewById(R.id.dotIdButton);
        percentbutton = findViewById(R.id.percentIdButton);

        textView = findViewById(R.id.showText);
        decimal=true;
        equalclick=false;

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "0");


            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();

                textView.setText(textView.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                textView.setText(textView.getText() + "9");
            }
        });

        dotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eqalclear();
                if(decimal){
                    textView.setText(textView.getText()+".");
                    decimal = false;
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eqalclear();
                        number1 = Float.parseFloat(textView.getText().toString() + "");
                        add = true;
                        textView.setText("");
                    decimal = true;
                }
                catch (Exception e){

                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eqalclear();
                    number1 = Float.parseFloat(textView.getText() + "");
                    sub = true;
                    textView.setText("");
                    decimal = true;
                }
                catch (Exception e){

                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eqalclear();
                    number1 = Float.parseFloat(textView.getText() + "");
                    mult = true;
                    textView.setText("");
                    decimal = true;
                }
                catch (Exception e){
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eqalclear();
                    number1 = Float.parseFloat(textView.getText() + "");
                    div = true;
                    textView.setText("");
                    decimal = true;
                }
                catch (Exception e){
                }
            }
        });
        percentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eqalclear();
                    number1 = Float.parseFloat(textView.getText() + "");
                    percent = true;
                    textView.setText("");
                    decimal = true;
                }
                catch (Exception e){
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalclick=true;
                try {
                    number2 = Float.parseFloat(textView.getText() + "");

                    if (add == true) {

                        number1=number1+number2;
                        textView.setText(number1 + "");
                        add = false;
                    }
                    if (sub == true) {
                        textView.setText(number1 - number2 + "");
                        sub = false;
                    }

                    if (mult == true) {
                        textView.setText(number1 * number2 + "");
                        mult = false;
                    }

                    if (div == true) {
                        textView.setText(number1 / number2 + "");
                        div = false;
                    }

                    if (percent==true) {
                        textView.setText(number1*(number2/100) + "");
                        percent = false;
                    }

                    textView.setText(textView.getText().toString());
                }
                catch (Exception e){
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                decimal = true;
            }
        });

        plusminusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    decimal = true;
                }
                catch (Exception e){
                }
            }
        });
    }

    public void eqalclear (){
        if (equalclick){
            textView.setText(null);
            equalclick=false;
        }
    }
}








