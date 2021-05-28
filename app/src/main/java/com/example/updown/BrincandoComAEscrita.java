package com.example.updown;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BrincandoComAEscrita extends AppCompatActivity {

    public Button botaoAprendendoNumero1;
    public Button botaoAprendendoNumero2;
    public Button botaoAprendendoNumero3;
    public Button botaoAprendendoNumero4;
    public Button botaoAprendendoNumero5;
    public Button botaoAprendendoNumero6;
    public Button botaoAprendendoNumero7;
    public Button botaoAprendendoNumero8;
    public Button botaoAprendendoNumero9;
    public Button botaoAprendendoNumero10;
    public ImageView botaovoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brincando_com_a_escrita);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        botaoAprendendoNumero1 = findViewById(R.id.aprn1);
        botaoAprendendoNumero2 = findViewById(R.id.aprn2);
        botaoAprendendoNumero3 = findViewById(R.id.aprn3);
        botaoAprendendoNumero4 = findViewById(R.id.aprn4);
        botaoAprendendoNumero5 = findViewById(R.id.aprn5);
        botaoAprendendoNumero6 = findViewById(R.id.aprn6);
        botaoAprendendoNumero7 = findViewById(R.id.aprn7);
        botaoAprendendoNumero8 = findViewById(R.id.aprn8);
        botaoAprendendoNumero9 = findViewById(R.id.aprn9);
        botaoAprendendoNumero10 = findViewById(R.id.aprn10);
        botaovoltar = findViewById(R.id.bvoltar);

        botaoAprendendoNumero1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero1Activity();

            }

        });

        botaoAprendendoNumero2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero2Activity();

            }


        });

        botaoAprendendoNumero3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero3Activity();

            }

        });

        botaoAprendendoNumero4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero4Activity();

            }

        });

        botaoAprendendoNumero5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero5Activity();

            }

        });

        botaoAprendendoNumero6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero6Activity();

            }

        });

        botaoAprendendoNumero7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero7Activity();

            }

        });

        botaoAprendendoNumero8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero8Activity();

            }

        });

        botaoAprendendoNumero9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero9Activity();

            }

        });

        botaoAprendendoNumero10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoAprendendoNumero10Activity();

            }

        });

        botaovoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoVoltarActivity();

            }

        });

    }

    private void botaoVoltarActivity() {

        startActivity(new Intent(BrincandoComAEscrita.this, MenuActivity.class));

    }

    private void botaoAprendendoNumero1Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN1.class));

    }

    private void botaoAprendendoNumero2Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN2.class));

    }

    private void botaoAprendendoNumero3Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN3.class));

    }

    private void botaoAprendendoNumero4Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN4.class));

    }

    private void botaoAprendendoNumero5Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN5.class));

    }

    private void botaoAprendendoNumero6Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN6.class));
        
    }

    private void botaoAprendendoNumero7Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN7.class));
        
    }

    private void botaoAprendendoNumero8Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN8.class));
        
    }

    private void botaoAprendendoNumero9Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN9.class));
        
    }

    private void botaoAprendendoNumero10Activity() {

        startActivity(new Intent(BrincandoComAEscrita.this, ConhecendoN10.class));
        
    }


}



