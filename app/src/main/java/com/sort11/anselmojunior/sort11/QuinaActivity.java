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

public class QuinaActivity extends AppCompatActivity {

    Button btnGeraQuina;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quina);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Quina");
        setSupportActionBar(toolbar);

        btnGeraQuina = findViewById(R.id.btnGerarQuina);
        txtResultado = findViewById(R.id.txtQuina);

        btnGeraQuina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int n = 1 + random.nextInt(50);
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
            startActivity(new Intent(QuinaActivity.this, MainActivity.class));
            return true;
        }

        if (id == R.id.megasena) {
            startActivity(new Intent(QuinaActivity.this, MegasenaActivity.class));
            return true;
        }

        if (id == R.id.lotofacil) {
            startActivity(new Intent(QuinaActivity.this, LotofacilActivity.class));
            return true;
        }

        if (id == R.id.lotomania) {
            startActivity(new Intent(QuinaActivity.this, LotomaniaActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
