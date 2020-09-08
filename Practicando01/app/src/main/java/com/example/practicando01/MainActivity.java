package com.example.practicando01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText editTextName = (EditText) findViewById(R.id.editTextName);

        Toast.makeText(MainActivity.this, "Hi there, " + editTextName.getText().toString(), Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivity.this, "Hi", editTextName.getText().toString(), Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}