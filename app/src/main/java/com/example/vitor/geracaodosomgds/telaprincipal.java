package com.example.vitor.geracaodosomgds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class telaprincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Removendo a barra de atividade
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_telaprincipal);
        ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo);
        imgLogo.setVisibility(View.VISIBLE);
    }

    public void abreCalendario(View view) {
        Intent intent = new Intent(telaprincipal.this, telacalendario.class);
        startActivity(intent);
    }

    public void abreLogin(View view)
    {
        Intent intent = new Intent(telaprincipal.this, loginBanda.class);
        startActivity(intent);
    }
}
