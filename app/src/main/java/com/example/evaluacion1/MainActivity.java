package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView monto;
    TextView advert;
    TextView diner;
    TextView recarga;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monto = findViewById(R.id.montoInicial);
        advert = findViewById(R.id.advertencia);
        diner = findViewById(R.id.dinero);
        recarga = findViewById(R.id.recarganueva);
        des = findViewById(R.id.descuentoxd);

    }

    public void LevantarActivity(View view) {
        int montoI = Integer.parseInt(monto.getText().toString());

        if (montoI < 5000) {
            Toast.makeText(this,"No puede ingresar valores menores a $5000", Toast.LENGTH_SHORT).show();
            advert.setText("No puede ingresar valores menores a $5000");
        }
        else {
            diner.setText("Su monto actual es de: " + montoI );
        }
    }

    public void Recargar(View view) {
        int saldoI = Integer.parseInt(recarga.getText().toString());
        int montoI = Integer.parseInt(monto.getText().toString());

        if (saldoI < 1000) {
            Toast.makeText(this,"No puede ingresar valores menores a $1000", Toast.LENGTH_SHORT).show();
            advert.setText("No puede ingresar valores menores a $1000");
        }
        else {
            int nuevo = saldoI + montoI;

            diner.setText("Su monto actual es de: " + nuevo);
        }
    }

    public void PagaTaxi(View view) {
        int saldoI = Integer.parseInt(recarga.getText().toString());
        int montoI = Integer.parseInt(monto.getText().toString());
        int nuevo = saldoI + montoI;
        int descuento = 600;

        int nuevo2 = nuevo - descuento;

        des.setText("Usted ha pagado por un taxi, su valor es de 600");
        diner.setText("Su monto actual es de: " + nuevo2);


    }

    public void PagaMetro(View view) {
        int saldoI = Integer.parseInt(recarga.getText().toString());
        int montoI = Integer.parseInt(monto.getText().toString());
        int nuevo = saldoI + montoI;
        int descuento = 750;

        int nuevo2 = nuevo - descuento;

        des.setText("Usted ha pagado por un taxi, su valor es de 750");
        diner.setText("Su monto actual es de: " + nuevo2);
    }

    public void Levantar(View view) {
        Intent intent = new Intent(this, MainActivity2.class);


        startActivity(intent);
    }


}