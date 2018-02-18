package com.example.android.angela_1202150261_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MenuUtama extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton btdine, bttake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        radioGroup = findViewById(R.id.radio);
    }

    public void pesansekarang (View view){
        int selectedID = radioGroup.getCheckedRadioButtonId();
        btdine = findViewById(R.id.dinein);
        bttake = findViewById(R.id.takeaway);

        //untuk pemilihan ke layout yang dituju sesuai radio button yang dipilih
        if (selectedID == btdine.getId()){
            Intent intent = new Intent(MenuUtama.this, DineIn.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(MenuUtama.this, TakeAway.class);
            startActivity(intent);
        }
    }
}