package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mamiferos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamiferos);
    }

    public void Regresar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}