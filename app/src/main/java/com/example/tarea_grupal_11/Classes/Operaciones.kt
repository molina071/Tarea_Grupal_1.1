package com.example.tarea_grupal_11.Classes

class Operaciones(private val valorNum1: Double, private val valorNum2: Double) {

    fun suma(): Double {
        return valorNum1 + valorNum2
    }

    fun resta(): Double {
        return valorNum1 - valorNum2
    }

    fun multiplicacion(): Double {
        return valorNum1 * valorNum2
    }

    fun division(): Double {
        if (valorNum2 == 0.0) {
            return 0.0
        }
        return valorNum1 / valorNum2
    }
}
