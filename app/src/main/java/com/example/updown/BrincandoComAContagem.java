package com.example.updown;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BrincandoComAContagem extends AppCompatActivity {

    ImageView image1, image2, image3, image4, imageMain;
    TextView tv_status;
    Button b_next;

    Integer[] images = {
            R.drawable.numero_1,
            R.drawable.numero_2,
            R.drawable.numero_3,
            R.drawable.numero_4,
            R.drawable.numero_5,
            R.drawable.numero_6,
            R.drawable.numero_7,
            R.drawable.numero_8,
            R.drawable.numero_9,
            R.drawable.numero_10,
    };

    Integer[] images_bw = {
            R.drawable.contagemfig_1,
            R.drawable.contagemfig_2,
            R.drawable.contagemfig_3,
            R.drawable.contagemfig_4,
            R.drawable.contagemfig_5,
            R.drawable.contagemfig_6,
            R.drawable.contagemfig_7,
            R.drawable.contagemfig_8,
            R.drawable.contagemfig_9,
            R.drawable.contagemfig_10,
    };

    //lista dos numeros para todas as imagens / atualmente 10
    Integer[] images_numbers ={ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int turn = 1;
    int correctAnswer = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brincando_com_a_contagem);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        imageMain = (ImageView) findViewById(R.id.imageMain);

        tv_status = (TextView) findViewById(R.id.tv_status);

        b_next = (Button) findViewById(R.id.b_next);

        //coloca aleatoriamente as imagens na tela
        Collections.shuffle(Arrays.asList(images_numbers));
        //coloca as imagens na tela
        setImages();

        //ao clicar
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verifica se está correto ou não
                if(correctAnswer == 1){
                    score++;
                    tv_status.setText("Correto!");
                    b_next.setVisibility(View.VISIBLE);
                } else {
                    tv_status.setText("Errado. Jogue novamente!");
                    b_next.setVisibility(View.VISIBLE);
                }

                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);
            }
        });


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verifica se está correto ou não
                if(correctAnswer == 2){
                    score++;
                    tv_status.setText("Correto!");
                    b_next.setVisibility(View.VISIBLE);
                } else {
                    tv_status.setText("Errado. Jogue novamente!");
                    b_next.setVisibility(View.VISIBLE);
                }

                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);
            }
        });


        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verifica se está correto ou não
                if(correctAnswer == 3){
                    score++;
                    tv_status.setText("Correto!");
                    b_next.setVisibility(View.VISIBLE);
                } else {
                    tv_status.setText("Errado. Jogue novamente!");
                    b_next.setVisibility(View.VISIBLE);
                }

                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });


        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verifica se está correto ou não
                if(correctAnswer == 4){
                    score++;
                    tv_status.setText("Correto!");
                    b_next.setVisibility(View.VISIBLE);
                } else {
                    tv_status.setText("Errado. Jogue novamente!");
                    b_next.setVisibility(View.VISIBLE);
                }

                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });

        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turn++;
                if(turn == 11){
                    checkEnd();
                } else {
                    setImages();
                }
            }
        });
    }

    private void setImages(){
        //determina qual imagem é a resposta correta
        Random r = new Random();
        correctAnswer = r.nextInt(4) + 1;

        //gera respostas erradas aleatorias
        int wrongAnswer1, wrongAnswer2 = 0, wrongAnswer3 = 0;

        do{
            wrongAnswer1 = r.nextInt(9);
        } while (wrongAnswer1 == images_numbers[turn]);

        do{
            wrongAnswer2 = r.nextInt(9);
        } while (wrongAnswer2 == images_numbers[turn] || wrongAnswer2 == wrongAnswer1);

        do{
            wrongAnswer3 = r.nextInt(9);
        } while (wrongAnswer3 == images_numbers[turn] || wrongAnswer3 == wrongAnswer1 || wrongAnswer3 == wrongAnswer2);

        switch (correctAnswer){
            case 1:
                image1.setImageResource(images[images_numbers[turn]]);
                image2.setImageResource(images[wrongAnswer1]);
                image3.setImageResource(images[wrongAnswer2]);
                image4.setImageResource(images[wrongAnswer3]);
                break;
            case 2:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[images_numbers[turn]]);
                image3.setImageResource(images[wrongAnswer2]);
                image4.setImageResource(images[wrongAnswer3]);
                break;
            case 3:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[wrongAnswer2]);
                image3.setImageResource(images[images_numbers[turn]]);
                image4.setImageResource(images[wrongAnswer3]);
                break;
            case 4:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[wrongAnswer2]);
                image3.setImageResource(images[wrongAnswer3]);
                image4.setImageResource(images[images_numbers[turn]]);
                break;
        }

        imageMain.setImageResource(images_bw[images_numbers[turn]]);

        tv_status.setText("");
        b_next.setVisibility(View.INVISIBLE);

        image1.setEnabled(true);
        image2.setEnabled(true);
        image3.setEnabled(true);
        image4.setEnabled(true);
    }

    private void checkEnd(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("FIM DO JOGO! Pontuação: " + score);
        alertDialogBuilder.setPositiveButton("Sair", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
