package com.example.practicando_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Change(View view){
        EditText editTextMount =(EditText)findViewById(R.id.editTextMount);
        Double dollar = Double.parseDouble(editTextMount.getText().toString());
        Double total = dollar * 3.56;


        Toast.makeText(this, "Total " + total, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}