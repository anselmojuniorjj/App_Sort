package com.sort11.anselmojunior.sort11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class LotomaniaActivity extends AppCompatActivity {

    Button btnGeraLotomania;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotomania);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Lotomania");
        setSupportActionBar(toolbar);

        btnGeraLotomania = findViewById(R.id.btnGerarLotomania);
        txtResultado = findViewById(R.id.txtLotomania);

        btnGeraLotomania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int n = random.nextInt(100);
                txtResultado.setText("" + n);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(LotomaniaActivity.this, MainActivity.class));
            return true;
        }

        if (id == R.id.megasena) {
            startActivity(new Intent(LotomaniaActivity.this, LotomaniaActivity.class));
            return true;
        }

        if (id == R.id.lotofacil) {
            startActivity(new Intent(LotomaniaActivity.this, LotofacilActivity.class));
            return true;
        }

        if (id == R.id.quina) {
            startActivity(new Intent(LotomaniaActivity.this, QuinaActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
