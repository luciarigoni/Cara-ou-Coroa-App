package com.luciarigoni.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageVoltar;
    private ImageView imageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0) {
            imageResultado.setImageResource(R.drawable.moeda_cara);
        } else {
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageVoltar = findViewById(R.id.imageVoltar);
        imageVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}