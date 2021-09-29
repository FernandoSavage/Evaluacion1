package com.example.evaluacion1;

public class Pasaje {
    private String pasaje;
    private int valor;
    private String codigo;
    private String numero_serie;

    public Pasaje() {
        pasaje = "";
        valor = 0;
        codigo = "";
        numero_serie = "";
    }

    public Pasaje(String pasaje, int valor, String codigo, String numero_serie) {
        this.pasaje = pasaje;
        this.valor = valor;
        this.codigo = codigo;
        this.numero_serie = numero_serie;
    }

    public String getPasaje() {
        return pasaje;
    }

    public void setPasaje(String pasaje) {
        this.pasaje = pasaje;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    @Override
    public String toString() {
        return "Pasaje{" +
                "pasaje='" + pasaje + '\'' +
                ", valor=" + valor +
                ", codigo='" + codigo + '\'' +
                ", numero_serie='" + numero_serie + '\'' +
                '}';
    }
}
