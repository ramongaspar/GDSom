package com.example.vitor.geracaodosomgds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class telaReserva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_reserva);
        // mostrando o botao voltar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("RESERVA");

    }
}
