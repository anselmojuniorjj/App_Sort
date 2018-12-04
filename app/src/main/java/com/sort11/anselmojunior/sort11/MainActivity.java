package com.sort11.anselmojunior.sort11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMega;
    private Button btnLotofacil;
    private Button btnQuina;
    private Button btnLotomania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Sort");
        setSupportActionBar(toolbar);

        btnMega = findViewById(R.id.btnSena);
        btnLotofacil = findViewById(R.id.btnLotoFacil);
        btnQuina = findViewById(R.id.btnQuina);
        btnLotomania = findViewById(R.id.btnLotoMania);

        btnMega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MegasenaActivity.class));
            }
        });

        btnLotofacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LotofacilActivity.class));
            }
        });

        btnQuina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuinaActivity.class));
            }
        });

        btnLotomania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LotomaniaActivity.class));
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
        if (id == R.id.megasena) {
            startActivity(new Intent(MainActivity.this, MegasenaActivity.class));
            return true;
        }

        if (id == R.id.lotofacil) {
            startActivity(new Intent(MainActivity.this, LotofacilActivity.class));
            return true;
        }

        if (id == R.id.quina) {
            startActivity(new Intent(MainActivity.this, QuinaActivity.class));
            return true;
        }

        if (id == R.id.lotomania) {
            startActivity(new Intent(MainActivity.this, LotomaniaActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
