package com.example.updown;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AprendendoN8P2 extends AppCompatActivity {

    private PaintView mPaintView;
    public Button finalizarAtividade;
    public Button refazerAtividade;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendendo_n8_parte2);
        mPaintView = findViewById(R.layout.activity_aprendendo_n8_parte2);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        finalizarAtividade = findViewById(R.id.finalizar_atividade_n8);
        refazerAtividade = findViewById(R.id.refazer_atividade_n8);

        finalizarAtividade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FinalizarAtividadeActivity();

            }

        });

        finalizarAtividade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                RefazerAtividadeActivity();

            }

        });
    }

    private void RefazerAtividadeActivity() {

        startActivity(new Intent(AprendendoN8P2.this, BrincandoComAEscrita.class));

    }

    private void FinalizarAtividadeActivity() {

        startActivity(new Intent(AprendendoN8P2.this, MenuActivity.class));

    }


}

