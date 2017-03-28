package com.example.vitor.geracaodosomgds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

import java.util.Calendar;

public class telacalendario extends AppCompatActivity {
    int diaClicado, diaProxEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mostrando o botao voltar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CalendarView calendarioGDS=(CalendarView) findViewById(R.id.cvCalendarioGDS);
        calendarioGDS.setOnDateChangeListener(new OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
               // Toast.makeText(getApplicationContext(), ""+dayOfMonth, Toast.LENGTH_SHORT).show(); //teste pra fazer mostrar o dia
                diaClicado = dayOfMonth;
                abreEvento();

            }
        });


    }

    public void abreEvento()
    {
        Intent intent = new Intent(telacalendario.this, teladiaevento.class);
        intent.putExtra("diaClicado", diaClicado);
        startActivity(intent);
    }


}
