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

public class Piano_tradicional extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tradicional);


        mediaPlayer = new MediaPlayer();
        toast = Toast.makeText(this, " ", Toast.LENGTH_SHORT);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
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

                        if (opciones[item].equals("Piano Infantil de la Selva")) {
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

    public void btnNotaDo_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.notado);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla DO");
        toast.show();
    }


    public void btnNotaRe_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.re);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla RE");
        toast.show();
    }

    public void btnNotaMi_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.mi);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla MI");
        toast.show();
    }

    public void btnNotaFa_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.fa);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla FA");
        toast.show();
    }

    public void btnNotaSol_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.sol);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla SOL");
        toast.show();
    }

    public void btnNotaLa_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.la);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla LA");
        toast.show();
    }

    public void btnNotaSi_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.si);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla SI");
        toast.show();
    }
}