package edu.uvm.test;
public class ConversorBase5 {

    public String convertirABase5(int numero) {
        if (numero == 0) return "0";

        boolean esNegativo = numero < 0;
        int valorAbsoluto = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();

        while (valorAbsoluto > 0) {
            resultado.insert(0, valorAbsoluto % 5);
            valorAbsoluto /= 5;
        }

        return esNegativo ? "-" + resultado.toString() : resultado.toString();
    }
}
