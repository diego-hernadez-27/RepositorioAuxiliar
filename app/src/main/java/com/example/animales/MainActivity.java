package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mamiferos(View view) {
        Intent tomami = new Intent(this, mamiferos.class);
        startActivity(tomami);
    }

    public void Aves(View view) {
        Intent toaves = new Intent(this, aves.class);
        startActivity(toaves);
    }

    public void Reptiles(View view) {
        Intent torept = new Intent(this, reptiles.class);
        startActivity(torept);
    }

}