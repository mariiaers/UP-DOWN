package com.example.updown;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AbrirComoJogarComSons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comojogarbrincandocomsons);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);
    }

}

