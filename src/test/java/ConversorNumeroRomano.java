package edu.uvm.test;
import edu.uvm.ConversorNumeroRomano;

public class ConversorNumeroRomano {

    private static final int[] VALORES = {
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4, 1
    };

    private static final String[] SIMBOLOS = {
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV", "I"
    };

    public String convertirARomano(int numero) {
        if (numero == 0) {
            throw new IllegalArgumentException("El cero no es un número romano válido");
        }
        if (numero >= 4000 || numero <= -4000) {
            throw new IllegalArgumentException("El número está fuera del rango válido (-3999 a 3999)");
        }

        StringBuilder resultado = new StringBuilder();
        int numeroAbsoluto = Math.abs(numero);

        for (int i = 0; i < VALORES.length; i++) {
            while (numeroAbsoluto >= VALORES[i]) {
                resultado.append(SIMBOLOS[i]);
                numeroAbsoluto -= VALORES[i];
            }
        }

        if (numero < 0) {
            return "-" + resultado.toString();
        }

        return resultado.toString();
    }
}
