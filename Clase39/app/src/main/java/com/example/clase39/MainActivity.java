package com.example.clase39;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            }else {
                return false;
            }

        }


        public boolean isTriangular() {
            int x =1;
            int triangularNumber =1;

            while(triangularNumber<number) {
                x++;
                triangularNumber = triangularNumber +x;
            }

            if (triangularNumber == number) {
                return true;
            }else {
                return false;
            }

        }

    }


    public void testNumber(View view){
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        Log.i("usersNumber", usersNumber.getText().toString());


        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(usersNumber.getText().toString());

        String message = "";

        if (myNumber.isSquare()){
            if (myNumber.isTriangular()){
                message = myNumber.number + " is both traingular and square!";
            }else{
                message = myNumber.number + " is square, but no triangular";

            }
        }else{
            if (myNumber.isTriangular()){
                message = myNumber.number + " is triangular but not square!";
            }else{
                message = myNumber.number + " is neither square nor triangular";

            }
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}