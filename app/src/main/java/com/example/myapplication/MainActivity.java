package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE","OnCreate Chamado");
        editValor = findViewById(R.id.editValor);
        spinner = findViewById(R.id.spinnerFrutas);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE","OnStart Chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE","OnResume Chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE","OnPause Chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","OnStop Chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","OnDestroy Chamado");
    }

    public void novaTela(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        Bundle bundle = new Bundle();

        String fruta=spinner.getSelectedItem().toString();
        float valor = Float.parseFloat(editValor.getText().toString());

        bundle.putFloat("valor", valor);
        bundle.putString("fruta", fruta);

        intent.putExtras(bundle);

        startActivity(intent);
        finish();
    }
}
