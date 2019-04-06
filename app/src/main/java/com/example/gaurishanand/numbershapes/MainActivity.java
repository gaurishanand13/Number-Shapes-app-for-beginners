package com.example.gaurishanand.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == (int)squareRoot) {

                return true;
            } else {

                return false;

            }

        }
        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;
                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }
        }
    };
    public void clickFunction(View view)
    {
        Number myNumber=new Number();
        if(editText.getText().toString().equals("")) {
            Toast.makeText(this, "PLEASE ENTER SOME NUMBER", Toast.LENGTH_LONG).show();
        }
        else
        {
           int numb=Integer.parseInt(editText.getText().toString());
           myNumber.number=numb;
           if(myNumber.isSquare() && myNumber.isTriangular())
           {
               Toast.makeText(this,"NUMBER IS BOTH TRIANGULAR AND SQAURE",Toast.LENGTH_LONG).show();
           }
           else if(!myNumber.isSquare() && myNumber.isTriangular())
           {
               Toast.makeText(this,"NUMBER IS TRIANGULAR BUT NOT SQAURE",Toast.LENGTH_LONG).show();
           }
           else if(myNumber.isSquare() && !myNumber.isTriangular())
           {
               Toast.makeText(this,"NUMBER IS SQAURE BUT NOT TRIANGULAR",Toast.LENGTH_LONG).show();
           }
           else if(!myNumber.isSquare() && !myNumber.isTriangular())
           {
               Toast.makeText(this,"NUMBER IS NEITHER TRIANGULAR NOR SQAURE",Toast.LENGTH_LONG).show();
           }
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.NumberseditText);
    }
}
