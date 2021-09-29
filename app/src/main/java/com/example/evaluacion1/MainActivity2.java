package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.eap.EapSessionConfig;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerPasaje;
    Adaptador adaptador;
    ArrayList<Pasaje> pasajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        inicializar();

    }

    private void inicializar() {
        recyclerPasaje = findViewById(R.id.lista);
        recyclerPasaje.setLayoutManager(new LinearLayoutManager(this));

        llenarContactos();

        adaptador = new Adaptador(pasajes);
        recyclerPasaje.setAdapter(adaptador);
    }

    private void llenarContactos() {


        Pasaje pasaje = new Pasaje();

        pasajes.add(new Pasaje("lgkrt", 35, "lkthh", "ekljgt"));

    }



}