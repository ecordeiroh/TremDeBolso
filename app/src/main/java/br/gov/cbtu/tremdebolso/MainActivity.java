package br.gov.cbtu.tremdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageButton bt, bt1, bt2, bt3, bt5;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        final Button btn_horario = (Button) findViewById(R.id.btn_horario);
        btn_horario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i =  new Intent(MainActivity.this, MainEstacoes.class);
                startActivity(i);

            }
        });

        final Button btn_grade = (Button) findViewById(R.id.btn_grade);
        btn_grade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        final Button btn_mapa = (Button) findViewById(R.id.btn_mapa);
        btn_mapa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i =  new Intent(MainActivity.this, MainEstacoesMapa.class);
                startActivity(i);

            }
        });

        final Button btn_fale = (Button) findViewById(R.id.btn_fale);
        btn_fale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i =  new Intent(MainActivity.this, MainFaleConosco.class);
                startActivity(i);

            }
        });

    }

}
