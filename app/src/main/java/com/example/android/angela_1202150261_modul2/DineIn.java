package com.example.android.angela_1202150261_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    Spinner spin;
    String spin1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        spin = findViewById(R.id.spinner);//untuk inisiasi spinner dan connect ke id spinner
        // untuk membuat fungsi meload data source spinner
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spin != null){spin.setAdapter(adapter);

        }
    }


    public void pilihpesan(View view) {
        String meja = spin.getSelectedItem().toString();
        Intent a = new Intent(DineIn.this, RecyclerViewActivity.class);
        Toast.makeText(this, "Anda DineIn di : " +meja, Toast.LENGTH_LONG).show();
        startActivity(a);
    }
}