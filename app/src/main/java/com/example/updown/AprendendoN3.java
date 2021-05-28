package com.example.updown;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AprendendoN3 extends AppCompatActivity {

    private PaintView mPaintView;
    public TextView botaoIrParaAtividadeSemTracado;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendendo_n3);
        mPaintView = findViewById(R.layout.activity_aprendendo_n3);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        botaoIrParaAtividadeSemTracado = findViewById(R.id.parte2_n3);

        botaoIrParaAtividadeSemTracado.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoIrParaAtividadeSemTracadoActivity();

            }

        });
    }

    private void botaoIrParaAtividadeSemTracadoActivity() {

        startActivity(new Intent(AprendendoN3.this, AprendendoN3P2.class));

    }
}
