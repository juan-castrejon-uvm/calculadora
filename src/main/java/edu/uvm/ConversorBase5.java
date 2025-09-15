package edu.uvm;

public class ConversorBase5 {
    public String convertirABase5(int numero) {
        if (numero == 0) return "0";
        boolean negativo = numero < 0;
        numero = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            resultado.insert(0, numero % 5);
            numero /= 5;
        }
        return negativo ? "-" + resultado.toString() : resultado.toString();
    }
}
