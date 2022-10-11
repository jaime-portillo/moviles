package com.my.first.pianogrupo02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Piano_tradicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tradicional);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void CerrarAplicacion() {
        LiberarRecursos();
        finishAffinity();
    }

    private void LiberarRecursos() {
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.changeMenu:
                AlertDialog.Builder window= new AlertDialog.Builder(this);

                final String[] opciones = {"Piano Tradicional", "Piano Infantil de la Selva", "Piano de Instrumentos musicales"};


                window.setItems(opciones, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        //here program the activity and toast
                        if (opciones[item].equals("Piano Tradicional")) {
                            Intent pianoTradicional = new Intent(Piano_tradicional.this, Piano_tradicional.class);
                            startActivity(pianoTradicional);
                        } else if (opciones[item].equals("Piano Infantil de la Selva")) {
                            Intent pianoJungle = new Intent(Piano_tradicional.this, Piano_infantil_selva.class);
                            startActivity(pianoJungle);

                        } else if (opciones[item].equals("Piano de Instrumentos musicales")) {
                            Intent pianoMusic = new Intent(Piano_tradicional.this, piano_Instrumentos.class);
                            startActivity(pianoMusic);
                        }
                    }
                });

                window.create();
                window.show();
                break;
            case R.id.about:
                Intent about = new Intent(Piano_tradicional.this,AcercaDe.class);
                startActivity(about);
                break;
            case R.id.exit:
                CerrarAplicacion();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}