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

public class piano_Instrumentos extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_instrumentos);
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
                AlertDialog.Builder window= new AlertDialog.Builder(this);
                //window.setTitle()
                final String[] opciones={"Piano Tradicional", "Piano Infantil de la Selva","Piano de Instrumentos musicales"};


                window.setItems(opciones, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        //here program the activity and toast
                        if ( opciones[item].equals("Piano Tradicional") ){
                            Intent pianoNormal = new Intent(piano_Instrumentos.this,Piano_tradicional.class);
                            LiberarRecursos();
                            startActivity(pianoNormal);

                        }else if(opciones[item].equals("Piano Infantil de la Selva")){
                            Intent pianoJungle = new Intent(piano_Instrumentos.this,Piano_tradicional.class);
                            LiberarRecursos();
                            startActivity(pianoJungle);
                        }

                    }
                });

                window.create();
                window.show();
                break;
            case R.id.about:
                Intent about = new Intent(piano_Instrumentos.this,AcercaDe.class);
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

    public void imvTeclaFlauta_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.flauta);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla de la Flauta");
        toast.show();
    }
    public void imvTeclaMaracas_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.maracas);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla de Maracas");
        toast.show();
    }
    public void imvTeclaSaxofon_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.sax);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Saxofon");
        toast.show();
    }
    public void imvTeclaClaTambor_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.tambor);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Tambor");
        toast.show();
    }
    public void imvTeclaClaViolin_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.violin);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla del Violin");
        toast.show();
    }
    public void imvTeclaGuitarra_onClick(View view) {

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.guitarra);
        mediaPlayer.start();
        toast.setText("Se precionó la tecla de la Guitarra");
        toast.show();
    }


}