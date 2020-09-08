package com.example.estudiando02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;


    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void cotizar(View view){
        EditText monto = (EditText) findViewById(R.id.editTextMonto);

        int guess = Integer.parseInt(monto.getText().toString());

        if(guess >randomNumber){
            makeToast("Lower");
        }else if(guess <randomNumber){
            makeToast("Higher");
        }else{
            makeToast("yeah that's it");
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}