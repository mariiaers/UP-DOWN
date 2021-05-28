package com.example.updown;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import static com.example.updown.R.layout.activity_menu_lateral;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    public ImageButton botaoBrincandoCContagem;
    public ImageButton botaoBrincandoCFormas;
    public Button botaoBrincandoCSons;
    public ImageButton botaoBrincandoCEscrita;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_menu_lateral);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        botaoBrincandoCSons = findViewById(R.id.button4);
        botaoBrincandoCEscrita = findViewById(R.id.botaoBrincandoComEscrita);
        botaoBrincandoCContagem = findViewById(R.id.botaoBrincandoComContagem);
        botaoBrincandoCFormas = findViewById(R.id.botaoBrincandoComFormas);


        botaoBrincandoCSons.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoBrincandoCSonsActivity();

            }

        });

        botaoBrincandoCEscrita.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoBrinacndoCEscritaActivity();

            }


        });

        botaoBrincandoCContagem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoBrincandoCContagemActivity();

            }

        });

        botaoBrincandoCFormas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botaoBrincandoCFormasActivity();

            }

        });

    }

    private void botaoBrincandoCSonsActivity() {

        startActivity(new Intent(MenuActivity.this, BrincandoComOsSons.class));

    }

    private void botaoBrinacndoCEscritaActivity() {

        startActivity(new Intent(MenuActivity.this, BrincandoComAEscrita.class));

    }

    private void botaoBrincandoCContagemActivity() {

        startActivity(new Intent(MenuActivity.this, BrincandoComAContagem.class));

    }

    private void botaoBrincandoCFormasActivity() {

        startActivity(new Intent(MenuActivity.this, BrincandoComAsFormas.class));

    }

    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lateral, menu);
        return true;
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()) {

            case R.id.nav_menu:
                Intent intent = new Intent(MenuActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_records:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new RecordsFragment()).commit();
                break;
            case R.id.nav_sobre:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new SobreFragment()).commit();
                break;

    }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }
}
