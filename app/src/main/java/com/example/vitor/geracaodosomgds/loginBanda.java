package com.example.vitor.geracaodosomgds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginBanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_banda);
        getSupportActionBar().setTitle("LOGIN DE BANDAS");
        //botao voltar strikes again =o
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void entrarClick(View view) {
        // aqui a gente vai ter que validar as credenciais com o bd. se a gente nao tiver bd,
        // definimos 2 strings com login e senha padrao e fuckit. depois disso é só chamar a outra tela \/
        //Intent intent = new Intent(loginBanda.this, //proximatela.class);
        //startactivity(intent);
    }

    public void abrirCadastro(View view)
    {
        Intent intent = new Intent(loginBanda.this, telacadastro.class);
        startActivity(intent);
    }
}
