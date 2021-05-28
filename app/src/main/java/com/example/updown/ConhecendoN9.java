package com.example.updown;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConhecendoN9 extends AppCompatActivity {

    public TextView botaoIrParaAtividade;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conhecendo_n9);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        botaoIrParaAtividade = findViewById(R.id.proximatela_n9);


        botaoIrParaAtividade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoIrParaAtividadeActivity();

            }

        });
    }

    private void botaoIrParaAtividadeActivity() {

        startActivity(new Intent(ConhecendoN9.this, AprendendoN9.class));

    }
}


