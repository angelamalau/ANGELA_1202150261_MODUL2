package com.example.android.angela_1202150261_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //menghubungkan SplashScreen ke MenuUtama dengan menggunakan intent
                Intent i = new Intent(SplashScreen.this, MenuUtama.class);
                startActivity(i);

                //Memunculkan toast
                Toast.makeText(SplashScreen.this, "ANGELA_1202150261", Toast.LENGTH_LONG).show();;

                //jeda selesai SplashScreen
                this.finish();
            }

            private void finish (){
            }
        }, splashInterval);
    }
}
