package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int quantity = 0;
    int total=0;
    int total2=0;
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView2);
        quantityTextView.setText("" + number);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment1(View view) {
        quantity = quantity + 1;
        display1(quantity);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);

    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement1(View view) {
        quantity = quantity - 1;
        if (quantity < 0) {
            quantity = 0;
        }
        display1(quantity);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);
    }


    int quantity2 = 0;

    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView3);
        quantityTextView.setText("" + number);
    }

    public void increment2(View view) {
        quantity2 = quantity2 + 1;
        display2(quantity2);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }

    public void decrement2(View view) {
        quantity2 = quantity2 - 1;
        if (quantity2 < 0) {
            quantity2 = 0;
        }
        display2(quantity2);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }

int quantity3=0;
    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView4);
        quantityTextView.setText("" + number);
    }
    public void increment3(View view) {
        quantity3 = quantity3 + 1;
        display3(quantity3);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);
    }
    public void decrement3(View view) {
        quantity3 = quantity3 - 1;
        if (quantity3 < 0) {
            quantity3 = 0;
        }
        display3(quantity3);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);
    }

    int quantity4=0;
    private void display4(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView5);
        quantityTextView.setText("" + number);
    }
    public void increment4(View view) {
        quantity4 = quantity4 + 1;
        display4(quantity4);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }
    public void decrement4(View view) {
        quantity4 = quantity4 - 1;
        if (quantity4 < 0) {
            quantity4 = 0;
        }
        display4(quantity4);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }

    int quantity5=0;
    private void display5(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView12);
        quantityTextView.setText("" + number);
    }
    public void increment5(View view) {
        quantity5 = quantity5 + 1;
        display5(quantity5);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);
    }
    public void decrement5(View view) {
        quantity5 = quantity5 - 1;
        if (quantity5 < 0) {
            quantity5 = 0;
        }
        display5(quantity5);
        total=3*quantity+2*quantity3+quantity5;
        totalscore(total);
    }

    int quantity6=0;
    private void display6(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView13);
        quantityTextView.setText("" + number);
    }
    public void increment6(View view) {
        quantity6 = quantity6 + 1;
        display6(quantity6);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }
    public void decrement6(View view) {
        quantity6 = quantity6 - 1;
        if (quantity6 < 0) {
            quantity6 = 0;
        }
        display6(quantity6);
        total2=3*quantity2+2*quantity4+quantity6;
        totalscore2(total2);
    }



    private void totalscore(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView16);
        priceTextView.setText("" + number);
    }


    private void totalscore2(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView17);
        priceTextView.setText("" + number);
    }

}