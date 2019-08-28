package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textInfo=findViewById(R.id.textInfo);
        Bundle tmp = getIntent().getExtras();

        String fruta = tmp.getString("fruta");
        float valor = tmp.getFloat("valor");

        String saida = "Fruta: "+ fruta + " Valor: "+ valor;
        textInfo.setText(saida);
    }
}
