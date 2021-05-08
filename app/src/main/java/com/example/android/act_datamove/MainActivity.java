package com.example.android.act_datamove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nimInput;
    EditText namaInput;
    EditText alamatInput;
    static String NIM_INPUT = "nim";
    static String NAMA_INPUT = "nama";
    static String ALAMAT_INPUT = "alamat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nimInput = findViewById(R.id.nimInput);
        namaInput = findViewById(R.id.namaInput);
        alamatInput = findViewById(R.id.alamatInput);
    }

    public void setSubmitBtnOnClick(View view) {
        String textInputA = nimInput.getText().toString();
        String textInputB = namaInput.getText().toString();
        String textInputC = alamatInput.getText().toString();
        Intent intent = new Intent( this, ActivityResult.class);
        intent.putExtra(NIM_INPUT, textInputA);
        intent.putExtra(NAMA_INPUT, textInputB);
        intent.putExtra(ALAMAT_INPUT, textInputC);
        startActivity(intent);
    }
}