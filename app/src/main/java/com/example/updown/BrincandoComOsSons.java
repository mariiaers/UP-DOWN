package com.example.updown;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class BrincandoComOsSons extends AppCompatActivity {

    public Button botaoComoJogar;
    public Button botaon1;
    public Button botaon2;
    public Button botaon3;
    public Button botaon4;
    public Button botaon5;
    public Button botaon6;
    public Button botaon7;
    public Button botaon8;
    public Button botaon9;
    public Button botaon10;
    public ImageView bvoltar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        final MediaPlayer somn1 = MediaPlayer.create(this, R.raw.numero1);
        final MediaPlayer somn2 = MediaPlayer.create(this, R.raw.numero2);
        final MediaPlayer somn3 = MediaPlayer.create(this, R.raw.numero3);
        final MediaPlayer somn4 = MediaPlayer.create(this, R.raw.numero4);
        final MediaPlayer somn5 = MediaPlayer.create(this, R.raw.numero5);
        final MediaPlayer somn6 = MediaPlayer.create(this, R.raw.numero6);
        final MediaPlayer somn7 = MediaPlayer.create(this, R.raw.numero7);
        final MediaPlayer somn8 = MediaPlayer.create(this, R.raw.numero8);
        final MediaPlayer somn9 = MediaPlayer.create(this, R.raw.numero9);
        final MediaPlayer somn10 = MediaPlayer.create(this, R.raw.numero10);
        bvoltar = findViewById(R.id.bvoltar);
        botaoComoJogar = findViewById(R.id.botaoComoJogarSons);
        botaon1 = findViewById(R.id.bnumero1);
        botaon2 = findViewById(R.id.bnumero2);
        botaon3 = findViewById(R.id.bnumero3);
        botaon4 = findViewById(R.id.bnumero4);
        botaon5 = findViewById(R.id.bnumero5);
        botaon6 = findViewById(R.id.bnumero6);
        botaon7 = findViewById(R.id.bnumero7);
        botaon8 = findViewById(R.id.bnumero8);
        botaon9 = findViewById(R.id.bnumero9);
        botaon10 = findViewById(R.id.bnumero10);



        bvoltar.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                bvoltarActivity();

            }

        });

        botaoComoJogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoComoJogarActivity();

            }

        });

        botaon1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn1.start();

            }

        });

        botaon2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn2.start();

            }

        });

        botaon3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn3.start();

            }

        });

        botaon4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn4.start();

            }

        });


        botaon5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn5.start();

            }

        });

        botaon6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn6.start();

            }

        });

        botaon7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn7.start();

            }

        });

        botaon8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn8.start();

            }

        });

        botaon9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn9.start();

            }

        });

        botaon10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                somn10.start();

            }

        });

    }

    private void botaoComoJogarActivity() {

        startActivity(new Intent(BrincandoComOsSons.this, AbrirComoJogarComSons.class));

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void bvoltarActivity() {

        startActivity(new Intent(BrincandoComOsSons.this, MainActivity.class));
        finishAffinity();

    }
    
}
