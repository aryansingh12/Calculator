package com.example.aryansingh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mult, div,dec,equal,clear;
    TextView result,info;

    double val1 = NaN;
    double val2 = NaN;

    boolean addition, subtraction, multiplication, division,negative;
    boolean firstAdd = true;
    double final_result;
    int val1_length, val2_length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);

        add = (Button) findViewById(R.id.add);
        mult = (Button) findViewById(R.id.mult);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);

        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);
        dec = (Button) findViewById(R.id.dec);

        result = (TextView) findViewById(R.id.info);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addition = true;
                if (result.getText() == "") {
                    result.setText("");
                }
               val1 = Double.parseDouble(result.getText().toString());
                result.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtraction = true;
                if (result.getText() == "") {
                    result.setText("");
                }
                val1 = Double.parseDouble(result.getText().toString());
                result.setText("");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                multiplication = true;
                if (result.getText() == "") {
                    result.setText("");
                }
                val1 = Double.parseDouble(result.getText().toString());
                result.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division = true;
                if (result.getText() == "") {
                    result.setText("");
                }
                val1 = Double.parseDouble(result.getText().toString());
                result.setText("");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                val2 = 0;
                val1 = 0;
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();
            }
        });
    }



    public void calc(){
        val2 = Double.parseDouble(result.getText() + "");

        if(addition){
            final_result = val1 + val2;
            result.setText(final_result + "");
            addition = false;
        }
        if(subtraction){
            final_result = val1 - val2;
            result.setText(final_result + "");
            subtraction = false;
        }
        if(multiplication){
            final_result = val1 * val2;
            result.setText(final_result + "");
            multiplication = false;
        }
        if(division){
            final_result = val1 / val2;
            result.setText(final_result + "");
            division = false;
        }

    }
}
//
//if (result.getText() == "") {
//        return;
//        }
//        if (isNaN(val1)) {
//        val1_length = result.length();
//        val1 = Double.parseDouble(result.getText() + "");
//        if (negative)
//        val1 = (-1) * val1;
//
//        result.setText(result.getText() + "/");
//        // addition = true;
//        } else {
//        if (firstAdd) {
//        String num = result.getText().toString();
//        num = num.substring(val1_length + 1, num.length());
//        val2 = Double.parseDouble(num);
//        final_result = val1 / val2;
//        firstAdd = false;
//        } else {
//        String num = result.getText().toString();
//        num = num.substring(val1_length + 3, num.length());
//        val2 = Double.parseDouble(num);
//        final_result = val1 / val2;
//        }
//
//        val1 = final_result;
//        result.setText(final_result + "/");
//        }