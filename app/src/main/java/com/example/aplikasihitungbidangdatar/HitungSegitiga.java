package com.example.aplikasihitungbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungSegitiga extends AppCompatActivity {

    EditText inputAlasSegitiga, inputTinggiSegitiga;
    TextView teksViewLuasSegitiga, teksViewKelilingSegitiga;
    Button tombolHitungSegitiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        initComponent();

    }

    private void initComponent(){
        inputAlasSegitiga = (EditText) findViewById(R.id.inputAlasSegitiga);
        inputTinggiSegitiga = (EditText) findViewById(R.id.inputTinggiSegitiga);
        teksViewLuasSegitiga = (TextView) findViewById(R.id.teksViewLuasSegitiga);
        teksViewKelilingSegitiga = (TextView) findViewById(R.id.teksViewKelilingSegitiga);
        tombolHitungSegitiga = (Button) findViewById(R.id.tombolHitungSegitiga);


    }

    public void hitungSegitiga(View v){
        int alas = Integer.parseInt(inputAlasSegitiga.getText().toString());
        int tinggi = Integer.parseInt(inputTinggiSegitiga.getText().toString());
        int luas = (alas * tinggi)/2;
        int keliling = 3*alas;
        teksViewLuasSegitiga.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKelilingSegitiga.setText("Keliling : "+String.valueOf(keliling)+" cm");
    }

    public void kembaliKeMenu(View v){
        finish();
    }

}

