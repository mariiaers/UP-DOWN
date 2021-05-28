package com.example.updown;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class BrincandoComAsFormas extends AppCompatActivity {

    ImageView iv_11, iv_12, iv_21, iv_22, iv_31, iv_32, iv_41, iv_42;

    //array para as imagens
    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204};

    //atual images
    int image101, image102, image201, image202, image301, image302, image401, image402;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brincando_com_as_formas);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_21.setTag("2");
        iv_22.setTag("3");
        iv_31.setTag("4");
        iv_32.setTag("5");
        iv_41.setTag("6");
        iv_42.setTag("7");

        //carregar as imagens do card
        frontOfCardsResources();

        //Embaralha as imagens
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_41, theCard);
            }
        });

        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_42, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card) {

        //verifica a imagem correta
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        } else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        } else if(cardsArray[card] == 103){
            iv.setImageResource(image201);
        }else if(cardsArray[card] == 104){
            iv.setImageResource(image202);
        }else if(cardsArray[card] == 201){
            iv.setImageResource(image301);
        }else if(cardsArray[card] == 202){
            iv.setImageResource(image302);
        }else if(cardsArray[card] == 203){
            iv.setImageResource(image401);
        }else if(cardsArray[card] == 204){
            iv.setImageResource(image402);
        }

        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        if(firstCard == secondCard) {
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 2) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 3) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 4) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 5) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 6) {
                iv_41.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 7) {
                iv_42.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 2) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 3) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 4) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 5) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 6) {
                iv_41.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 7) {
                iv_42.setVisibility(View.INVISIBLE);
            }

        } else {
            iv_11.setImageResource(R.drawable.mem);
            iv_12.setImageResource(R.drawable.mem);
            iv_21.setImageResource(R.drawable.mem);
            iv_22.setImageResource(R.drawable.mem);
            iv_31.setImageResource(R.drawable.mem);
            iv_32.setImageResource(R.drawable.mem);
            iv_41.setImageResource(R.drawable.mem);
            iv_42.setImageResource(R.drawable.mem);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);

        checkEnd();
    }

    private void checkEnd() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(BrincandoComAsFormas.this);
                alertDialogBuilder.setMessage("PARABÉNS!!\nFIM DE JOGO!!");
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setPositiveButton("JOGAR NOVAMENTE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                alertDialogBuilder.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources() {

        image101 = R.drawable.circulo1;
        image102 = R.drawable.quadrado1;
        image201 = R.drawable.retangulo1;
        image202 = R.drawable.triangulo1;
        image301 = R.drawable.circulo2;
        image302 = R.drawable.quadrado2;
        image401 = R.drawable.retangulo2;
        image402 = R.drawable.triangulo2;

    }

}


