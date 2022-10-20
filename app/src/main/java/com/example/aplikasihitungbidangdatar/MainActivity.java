package com.example.aplikasihitungbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputPanjangAlasDiameter, inputLebarTinggi;
    TextView teksViewLuas, teksViewKeliling;
    Button tombolHitungPersegi, getTombolHitungSegitiga, getTombolHitungLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();

        }

        private  void initComponent(){
        inputPanjangAlasDiameter = (EditText) findViewById(R.id.inputPanjangAlasDiameter);
        inputLebarTinggi = (EditText) findViewById(R.id.inputLebarTinggi);
        teksViewLuas = (TextView) findViewById(R.id.teksViewLuas);
        teksViewKeliling = (TextView) findViewById(R.id.teksViewKeliling);
        tombolHitungPersegi = (Button) findViewById(R.id.tombolHitungPersegi);
        getTombolHitungSegitiga = (Button) findViewById(R.id.tombolHitungSegitiga);
        getTombolHitungLingkaran = (Button) findViewById(R.id.tombolHitungLingkaran);

    }

    public  void  hitungPersegi(View v){
        float panjang = Integer.parseInt(inputPanjangAlasDiameter.getText().toString());
        float lebar = Integer.parseInt(inputLebarTinggi.getText().toString());
        float luas = panjang * lebar;
        float keliling = (2*panjang) + (2*lebar);
        teksViewLuas.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKeliling.setText("keliling : "+String.valueOf(keliling)+" cm");
    }

    public  void hitungSegitiga(View v){
        float alas = Integer.parseInt(inputPanjangAlasDiameter.getText().toString());
        float tinggi = Integer.parseInt(inputLebarTinggi.getText().toString());
        float luas = (alas * tinggi)/2;
        float keliling = 3*alas;
        teksViewLuas.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKeliling.setText("keliling : "+String.valueOf(keliling)+" cm");
    }

    public void hitungLingkaran(View v){
        float diameter = Integer.parseInt(inputPanjangAlasDiameter.getText().toString());
        float luas = (float) (Math.PI * Math.pow(diameter /2, 2));
        float keliling = (float) (Math.PI * diameter);
        teksViewLuas.setText("Luas : "+String.valueOf(luas)+" cm2");
        teksViewKeliling.setText("keliling : "+String.valueOf(keliling)+" cm");
    }

}