package com.example.tarea_grupal_11.Classes;

public class Operaciones {

    private double valorNum1;
    private double valorNum2;

    public Operaciones(double valorNum1, double valorNum2) {
        this.valorNum1 = valorNum1;
        this.valorNum2 = valorNum2;
    }

    public double suma() {
        return valorNum1 + valorNum2;
    }

    public double resta() {
        return valorNum1 - valorNum2;
    }

    public double multiplicacion() {
        return valorNum1 * valorNum2;
    }

    public double division() {
        if (valorNum2 == 0) {
            return 0;
        }
        return valorNum1 / valorNum2;
    }
}
