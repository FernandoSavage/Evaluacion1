package com.example.evaluacion1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private ArrayList<Pasaje> pasajes;

    public Adaptador(ArrayList<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pasajex.setText(pasajes.get(position).getPasaje());
        holder.valorx.setText(pasajes.get(position).getValor());
        holder.codigox.setText(pasajes.get(position).getCodigo());
        holder.numero_seriex.setText(pasajes.get(position).getNumero_serie());
    }

    @Override
    public int getItemCount() {
        return pasajes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pasajex;
        private TextView valorx;
        private TextView codigox;
        private TextView numero_seriex;

        public ViewHolder(View itemView) {
            super(itemView);

            pasajex = itemView.findViewById(R.id.pasajeview);
            valorx = itemView.findViewById(R.id. valorview);
            codigox = itemView.findViewById(R.id.codigoview);
            numero_seriex = itemView.findViewById(R.id.numeroserieview);
        }
    }
}
