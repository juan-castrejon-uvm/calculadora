package edu.uvm.test;
import edu.uvm.ConversorBase5;
public class ConversorBase5 {

    public String convertirABase5(int numero) {
        // Caso especial: 0
        if (numero == 0) {
            return "0";
        }

        boolean esNegativo = numero < 0;
        int valorAbsoluto = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();

        while (valorAbsoluto > 0) {
            int digito = valorAbsoluto % 5;
            resultado.insert(0, digito);
            valorAbsoluto /= 5;
        }

        if (esNegativo) {
            resultado.insert(0, "-");
        }

        return resultado.toString();
    }
}
