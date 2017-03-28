package com.example.vitor.geracaodosomgds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class teladiaevento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladiaevento);

        // mostrando o botao voltar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int diaClicado = intent.getIntExtra("diaClicado", 0);

        TextView txtDia = (TextView) findViewById(R.id.txtDia);
        txtDia.setText("" + diaClicado);
    }

    public void abreReserva()
    {
        Intent intent = new Intent(teladiaevento.this, telaReserva.class);
        startActivity(intent);
    }
}
