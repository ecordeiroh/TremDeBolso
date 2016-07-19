package br.gov.cbtu.tremdebolso.horarios_sul;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

import br.gov.cbtu.tremdebolso.R;

public class Satelite extends AppCompatActivity {

    LinearLayout ly_1, ly_2, ly_3, ly_4, ly_5, ly_6, ly_7, ly_8, ly_9, ly_10, ly_11, ly_12, ly_13, ly_quartas, ly_14,ly_quarta;
    TextView tv1, tv1_1, tv2, tv2_1, tv3, tv3_1, tv4, tv4_1, tv5, tv5_1, tv6, tv6_1,tv7, tv7_1;
    TextView tv8, tv8_1, tv9, tv9_1, tv10, tv10_1, tv11, tv11_1, tv12, tv12_1, tv13, tv13_1,tv_quartas, tv_quartas_1, tv14, tv14_1,tv_quarta, tv_quarta_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario__satelite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ly_1 = (LinearLayout) findViewById(R.id.ly_1);
        ly_2 = (LinearLayout) findViewById(R.id.ly_2);
        ly_3 = (LinearLayout) findViewById(R.id.ly_3);
        ly_4 = (LinearLayout) findViewById(R.id.ly_4);
        ly_5 = (LinearLayout) findViewById(R.id.ly_5);
        ly_6 = (LinearLayout) findViewById(R.id.ly_6);
        ly_7 = (LinearLayout) findViewById(R.id.ly_7);
        ly_8 = (LinearLayout) findViewById(R.id.ly_8);
        ly_9 = (LinearLayout) findViewById(R.id.ly_9);
        ly_10 = (LinearLayout) findViewById(R.id.ly_10);
        ly_11 = (LinearLayout) findViewById(R.id.ly_11);
        ly_12 = (LinearLayout) findViewById(R.id.ly_12);
        ly_13 = (LinearLayout) findViewById(R.id.ly_13);
        ly_14 = (LinearLayout) findViewById(R.id.ly_14);
        ly_quartas = (LinearLayout) findViewById(R.id.ly_quartas);
        ly_quarta = (LinearLayout) findViewById(R.id.ly_quarta);

        tv1 = (TextView) findViewById(R.id.text_1);
        tv1_1 = (TextView) findViewById(R.id.text_1_1);
        tv2 = (TextView) findViewById(R.id.text_2);
        tv2_1 = (TextView) findViewById(R.id.text_2_1);
        tv3 = (TextView) findViewById(R.id.text_3);
        tv3_1 = (TextView) findViewById(R.id.text_3_1);
        tv4 = (TextView) findViewById(R.id.text_4);
        tv4_1 = (TextView) findViewById(R.id.text_4_1);
        tv5 = (TextView) findViewById(R.id.text_5);
        tv5_1 = (TextView) findViewById(R.id.text_5_1);
        tv6 = (TextView) findViewById(R.id.text_6);
        tv6_1 = (TextView) findViewById(R.id.text_6_1);
        tv7 = (TextView) findViewById(R.id.text_7);
        tv7_1 = (TextView) findViewById(R.id.text_7_1);
        tv8 = (TextView) findViewById(R.id.text_8);
        tv8_1 = (TextView) findViewById(R.id.text_8_1);
        tv9 = (TextView) findViewById(R.id.text_9);
        tv9_1 = (TextView) findViewById(R.id.text_9_1);
        tv10 = (TextView) findViewById(R.id.text_10);
        tv10_1 = (TextView) findViewById(R.id.text_10_1);
        tv11 = (TextView) findViewById(R.id.text_11);
        tv11_1 = (TextView) findViewById(R.id.text_11_1);
        tv12 = (TextView) findViewById(R.id.text_12);
        tv12_1 = (TextView) findViewById(R.id.text_12_1);
        tv13 = (TextView) findViewById(R.id.text_13);
        tv13_1 = (TextView) findViewById(R.id.text_13_1);
        tv14 = (TextView) findViewById(R.id.text_14);
        tv14_1 = (TextView) findViewById(R.id.text_14_1);
        tv_quartas = (TextView) findViewById(R.id.text_quartas);
        tv_quartas_1 = (TextView) findViewById(R.id.text_quartas_1);
        tv_quarta = (TextView) findViewById(R.id.text_quarta);
        tv_quarta_1 = (TextView) findViewById(R.id.text_quarta_1);

        //Aqui é onde pega as horas e minutos
        Calendar cal = Calendar.getInstance();

        int horas = cal.get(Calendar.HOUR_OF_DAY);
        int minutos = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        // A semana começa no Domingo = 1

        //cal.set(Calendar.DAY_OF_WEEK, 1);
        int dia = cal.get(Calendar.DAY_OF_WEEK);


        //Onde começa a semana de segunda a sábado
        if (horas == 05 && minutos >= 35 && minutos <= 52 && dia >= 2 && dia <= 7 ) {

            ly_1.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv1_1.setVisibility(View.VISIBLE);
            tv1.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 7 && minutos >= 0 && minutos <= 36 && dia >= 2 && dia <= 7) {

            ly_2.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv2_1.setVisibility(View.VISIBLE);
            tv2.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 9 && minutos >= 0 && minutos <= 20 && dia >= 2 && dia <= 7) {

            ly_3.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv3_1.setVisibility(View.VISIBLE);
            tv3.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 12 && minutos >= 30 && minutos <= 54 && dia >= 2 && dia <= 7 ) {

            ly_4.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv4_1.setVisibility(View.VISIBLE);
            tv4.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 14 && minutos >= 0 && minutos <= 38 && dia >= 2 && dia <= 6) {

            ly_5.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv5_1.setVisibility(View.VISIBLE);
            tv5.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 16 && minutos >= 0 && minutos <= 22 && dia >= 2 && dia <= 6) {

            ly_13.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv13_1.setVisibility(View.VISIBLE);
            tv13.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 17 && minutos >= 35 && minutos <= 59 && dia >= 2 && dia <= 6 || horas == 18 && minutos >= 0 && minutos <= 5) {

            ly_6.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv6_1.setVisibility(View.VISIBLE);
            tv6.setTextColor(Color.parseColor("#007231"));

        }

        //Aqui só nas Quartas-Feiras
        if (dia == 4) {
            ly_quartas.setVisibility(View.VISIBLE);

            if (horas == 10 && minutos >= 35 && minutos <= 59 || horas == 11 && minutos >= 0 && minutos <= 4) {
                ly_quartas.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv_quartas_1.setVisibility(View.VISIBLE);
                tv_quartas.setTextColor(Color.parseColor("#007231"));
            }
        }

        //Domingo
        if (dia == 1) {

            ly_5.setVisibility(View.GONE);
            ly_6.setVisibility(View.GONE);
            ly_13.setVisibility(View.GONE);
            ly_3.setVisibility(View.GONE);
            ly_4.setVisibility(View.GONE);

            tv1.setText("09:12");
            if (horas == 8 && minutos >= 35 && minutos <= 59 || horas == 9 && minutos >= 0 && minutos <=12) {

                ly_1.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv1_1.setVisibility(View.VISIBLE);
                tv1.setTextColor(Color.parseColor("#007231"));

            }
            tv2.setText("13:12");
            if (horas == 12 && minutos >= 35 && minutos <= 59 || horas == 13 && minutos >= 0 && minutos <= 12) {

                ly_2.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv2_1.setVisibility(View.VISIBLE);
                tv2.setTextColor(Color.parseColor("#007231"));

            }
        }


        //Linhas Sentido Parnamirim

        if (horas == 06 && minutos >= 35 && minutos <= 59 && dia >= 2 && dia <= 7 || horas == 7 && minutos >= 0 && minutos <= 5){

            ly_7.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv7_1.setVisibility(View.VISIBLE);
            tv7.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 8 && minutos >= 0 && minutos <= 49 && dia >= 2 && dia <= 7 ){

            ly_8.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv8_1.setVisibility(View.VISIBLE);
            tv8.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 11 && minutos >= 35 && minutos <= 59 && dia >= 2 && dia <= 7 || horas == 12 && minutos >= 0 && minutos <= 23){

            ly_9.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv9_1.setVisibility(View.VISIBLE);
            tv9.setTextColor(Color.parseColor("#007231"));

        }
        if(dia == 7){
            ly_11.setVisibility(View.GONE);
            ly_12.setVisibility(View.GONE);
            ly_14.setVisibility(View.GONE);

            tv10.setText("14:33");
            if(horas == 14 && minutos >= 0 && minutos <= 33){

                ly_10.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv10_1.setVisibility(View.VISIBLE);
                tv10.setTextColor(Color.parseColor("#007231"));

            }


        }
        if (horas == 13 && minutos >= 35 && minutos <= 59 && dia >= 2 && dia <= 6 || horas == 14 && minutos >= 0 && minutos <= 7){

            ly_10.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv10_1.setVisibility(View.VISIBLE);
            tv10.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 15 && minutos >= 0 && minutos <= 51 && dia >= 2 && dia <= 6 ){

            ly_11.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv11_1.setVisibility(View.VISIBLE);
            tv11.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 17 && minutos >= 00 && minutos <= 35 && dia >= 2 && dia <= 6 ){

            ly_12.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv12_1.setVisibility(View.VISIBLE);
            tv12.setTextColor(Color.parseColor("#007231"));

        }
        if (horas == 18 && minutos >= 35 && minutos <= 59 && dia >= 2 && dia <= 6 || horas == 19 && minutos >= 0 && minutos <= 18){

            ly_14.setBackgroundColor(Color.parseColor("#CCEBD9"));
            tv14_1.setVisibility(View.VISIBLE);
            tv14.setTextColor(Color.parseColor("#007231"));

        }

        //Aqui só nas Quartas-Feiras
        if(dia == 4) {
            ly_quarta.setVisibility(View.VISIBLE);

            if (horas == 10 && minutos >= 0 && minutos <= 33 ){
                ly_quarta.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv_quarta_1.setVisibility(View.VISIBLE);
                tv_quarta.setTextColor(Color.parseColor("#007231"));}
        }

        //Domingo
        if(dia == 1){

            ly_9.setVisibility(View.GONE);
            ly_10.setVisibility(View.GONE);
            ly_11.setVisibility(View.GONE);
            ly_12.setVisibility(View.GONE);
            ly_14.setVisibility(View.GONE);

            tv7.setText("12:33");
            if(horas == 12 && minutos >= 0 && minutos <= 33){

                ly_7.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv7_1.setVisibility(View.VISIBLE);
                tv7.setTextColor(Color.parseColor("#007231"));

            }
            tv8.setText("15:33");
            if(horas == 15 && minutos >= 0 && minutos <= 33){

                ly_8.setBackgroundColor(Color.parseColor("#CCEBD9"));
                tv8_1.setVisibility(View.VISIBLE);
                tv8.setTextColor(Color.parseColor("#007231"));

            }
        }

    }
}



