package com.example.aplikasihitungbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungPersegi extends AppCompatActivity {

    EditText inputPanjangPersegi, inputLebarPersegi;
    TextView teksViewLuasPersegi, teksViewKelilingPersegi;
    Button tombolHitungPersegi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);
        initComponent();

    }

    private void initComponent(){
        inputPanjangPersegi = (EditText) findViewById(R.id.inputPanjangPersegi);
        inputLebarPersegi = (EditText) findViewById(R.id.inputLebarPersegi);
        teksViewLuasPersegi = (TextView) findViewById(R.id.teksViewLuasPersegi);
        teksViewKelilingPersegi = (TextView) findViewById(R.id.teksViewKelilingPersegi);
        tombolHitungPersegi = (Button) findViewById(R.id.tombolHitungPersegi);


    }

    public void hitungPersegi(View v){
        int panjang = Integer.parseInt(inputPanjangPersegi.getText().toString());
        int lebar = Integer.parseInt(inputLebarPersegi.getText().toString());
        int luas = panjang * lebar;
        int keliling = (2*panjang) + (2*lebar);
        teksViewLuasPersegi.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKelilingPersegi.setText("Keliling : "+String.valueOf(keliling) +" cm");
    }

    public void kembaliKeMenu(View v){
        finish();
    }

}

