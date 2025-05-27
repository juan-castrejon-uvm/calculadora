package edu.uvm.test;
public class ConversorNumeroRomano {

    private static final int[] VALORES = {
        1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] SIMBOLOS = {
        "M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String convertirARomano(int numero) {
        if (numero == 0) {
            throw new IllegalArgumentException("El cero no es un número romano válido");
        }
        if (numero >= 4000 || numero <= -4000) {
            throw new IllegalArgumentException("Números >= 4000 o <= -4000 no son válidos");
        }

        boolean esNegativo = numero < 0;
        int valorAbsoluto = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < VALORES.length; i++) {
            while (valorAbsoluto >= VALORES[i]) {
                resultado.append(SIMBOLOS[i]);
                valorAbsoluto -= VALORES[i];
            }
        }

        return esNegativo ? "-" + resultado.toString() : resultado.toString();
    }
}
