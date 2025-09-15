package edu.uvm;

public class ConversorNumeroRomano {
    private static final int[] VALORES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SIMBOLOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String convertirARomano(int numero) {
        if (numero == 0 || numero >= 4000 || numero <= -4000) {
            throw new IllegalArgumentException("Número fuera del rango válido para romanos");
        }

        boolean negativo = numero < 0;
        numero = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < VALORES.length; i++) {
            while (numero >= VALORES[i]) {
                resultado.append(SIMBOLOS[i]);
                numero -= VALORES[i];
            }
        }

        return negativo ? "-" + resultado.toString() : resultado.toString();
    }
}
