package com.my.first.pianogrupo02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Piano_infantil_selva extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_infantil_selva);
        mediaPlayer = new MediaPlayer();
        toast = Toast.makeText(this, " ", Toast.LENGTH_SHORT);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.changeMenu:
                AlertDialog.Builder window = new AlertDialog.Builder(this);

                final String[] opciones = {"Piano Tradicional", "Piano Infantil de la Selva", "Piano de Instrumentos musicales"};

                window.setItems(opciones, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        //here program the activity and toast
                        if (opciones[item].equals("Piano Tradicional")) {
                            Intent pianoNormal = new Intent(Piano_infantil_selva.this, Piano_tradicional.class);
                            LiberarRecursos();
                            startActivity(pianoNormal);
                        } else if (opciones[item].equals("Piano de Instrumentos musicales")) {
                            Intent pianoMusic = new Intent(Piano_infantil_selva.this, piano_Instrumentos.class);
                            LiberarRecursos();
                            startActivity(pianoMusic);
                        }
                    }
                });

                window.create();
                window.show();
                break;
            case R.id.about:
                Intent about = new Intent(Piano_infantil_selva.this, AcercaDe.class);
                LiberarRecursos();
                startActivity(about);

                break;
            case R.id.exit:
                CerrarAplicacion();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void LiberarRecursos() {
        mediaPlayer.release();
        mediaPlayer = null;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void CerrarAplicacion() {
        LiberarRecursos();
        finishAffinity();
    }
    public void imvTeclaGato_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.gato);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Gato");
        toast.show();
    }

    public void imvTeclaPerro_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.perro);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla de la Perro");
        toast.show();
    }

    public void imvTeclaDelfin_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.delfin);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Delfin");
        toast.show();
    }

    public void imvTeclaOso_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.oso);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Oso");
        toast.show();
    }

    public void imvTeclaTigre_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.tigre);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla de la Tigre");
        toast.show();
    }

    public void imvTeclaPerico_onClick(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.perico);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Perico");
        toast.show();
    }




}