package com.example.aplikasihitungbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungLingkaran extends AppCompatActivity {

    EditText inputDiameterLingkaran;
    TextView teksViewLuasLingkaran, teksViewKelilingLingkaran;
    Button tombolHitungLingkaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        initComponent();

    }

    private void initComponent(){
        inputDiameterLingkaran = (EditText) findViewById(R.id.inputDiameterLingkaran);
        teksViewLuasLingkaran = (TextView) findViewById(R.id.teksViewLuasLingkaran);
        teksViewKelilingLingkaran = (TextView) findViewById(R.id.teksViewKelilingLingkaran);
        tombolHitungLingkaran = (Button) findViewById(R.id.tombolHitungLingkaran);


    }

    public void hitungLingkaran(View v){
        int diameter = Integer.parseInt(inputDiameterLingkaran.getText().toString());

        int luas = (int) (Math.PI * Math.pow(diameter / 2, 2));
        int keliling = (int) (Math.PI * diameter);
        teksViewLuasLingkaran.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKelilingLingkaran.setText("Keliling : "+String.valueOf(keliling)+" cm");

    }

    public void kembaliKeMenu(View v){
        finish();
    }

}

