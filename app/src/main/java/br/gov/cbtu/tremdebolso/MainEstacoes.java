package br.gov.cbtu.tremdebolso;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import br.gov.cbtu.tremdebolso.horarios_norte.Natal_Norte;
import br.gov.cbtu.tremdebolso.horarios_sul.Alecrim2;
import br.gov.cbtu.tremdebolso.horarios_sul.BomPastor;
import br.gov.cbtu.tremdebolso.horarios_sul.CidadeEsperanca;
import br.gov.cbtu.tremdebolso.horarios_sul.JardimAeroporto;
import br.gov.cbtu.tremdebolso.horarios_sul.Natal;
import br.gov.cbtu.tremdebolso.horarios_sul.PadreJoaoMaria;
import br.gov.cbtu.tremdebolso.horarios_sul.Parnamirim;
import br.gov.cbtu.tremdebolso.horarios_sul.Pitimbu;
import br.gov.cbtu.tremdebolso.horarios_sul.Promorar;
import br.gov.cbtu.tremdebolso.horarios_sul.Satelite;

public class MainEstacoes extends AppCompatActivity {

    Intent i;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estacoes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button btn_natal = (Button)findViewById(R.id.btn_natal);
        btn_natal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Natal.class);
                startActivity(i);
            }
        });

        Button btn_alecrim2 = (Button)findViewById(R.id.btn_alecrim);
        btn_alecrim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Alecrim2.class);
                startActivity(i);
            }
        });
        Button btn_pjoao = (Button)findViewById(R.id.btn_padrej);
        btn_pjoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, PadreJoaoMaria.class);
                startActivity(i);
            }
        });
        Button btn_bomp = (Button)findViewById(R.id.btn_bomp);
        btn_bomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, BomPastor.class);
                startActivity(i);
            }
        });
        Button btn_cidadee = (Button)findViewById(R.id.btn_cidadee);
        btn_cidadee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, CidadeEsperanca.class);
                startActivity(i);
            }
        });
        Button btn_promorar = (Button)findViewById(R.id.btn_promorar);
        btn_promorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Promorar.class);
                startActivity(i);
            }
        });
        Button btn_pitimbu = (Button)findViewById(R.id.btn_pitimbu);
        btn_pitimbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Pitimbu.class);
                startActivity(i);
            }
        });
        Button btn_satelite = (Button)findViewById(R.id.btn_satelite);
        btn_satelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Satelite.class);
                startActivity(i);
            }
        });
        Button btn_jdaero = (Button)findViewById(R.id.btn_jardima);
        btn_jdaero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, JardimAeroporto.class);
                startActivity(i);
            }
        });
        Button btn_parnamirim = (Button)findViewById(R.id.btn_parnamirim);
        btn_parnamirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Parnamirim.class);
                startActivity(i);
            }
        });

        //buttons linhas Norte
        Button btn_natal_norte = (Button)findViewById(R.id.btn_natalnorte);
        btn_natal_norte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainEstacoes.this, Natal_Norte.class);
                startActivity(i);
            }
        });

    }
}
