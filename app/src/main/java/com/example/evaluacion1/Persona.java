package com.example.evaluacion1;

import java.io.Serializable;

public class Persona implements Serializable {
    private int saldo;

    public Persona() {
        saldo = 0;
    }

    public Persona(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "saldo=" + saldo +
                '}';
    }
}
