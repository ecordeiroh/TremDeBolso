package br.gov.cbtu.tremdebolso;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainFaleConosco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fale_conosco);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView txLink = (TextView)findViewById(R.id.text_face1);
        if (txLink != null) {
            txLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
