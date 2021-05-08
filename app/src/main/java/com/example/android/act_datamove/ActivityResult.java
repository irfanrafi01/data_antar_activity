package com.example.android.act_datamove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {
    TextView nimResult;
    TextView namaResult;
    TextView alamatResult;
    static String NIM_INPUT = "nim";
    static String NAMA_INPUT = "nama";
    static String ALAMAT_INPUT = "alamat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        nimResult = findViewById(R.id.nimResult);
        namaResult = findViewById(R.id.namaResult);
        alamatResult = findViewById(R.id.alamatResult);
        Intent intent = getIntent();
        String textInputA = intent.getStringExtra(NIM_INPUT);
        String textInputB = intent.getStringExtra(NAMA_INPUT);
        String textInputC = intent.getStringExtra(ALAMAT_INPUT);
        nimResult.setText(textInputA);
        namaResult.setText(textInputB);
        alamatResult.setText(textInputC);
    }
}