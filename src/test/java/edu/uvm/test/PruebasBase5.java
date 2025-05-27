package edu.uvm.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas del Conversor a Base 5")
class ConversorBase5Test {

    private ConversorBase5 conversor;

    @BeforeEach
    void inicializar() {
        conversor = new ConversorBase5();
    }

    // --- Caso Base ---
    @Test
    @DisplayName("0 debería convertirse a \"0\"")
    void pruebaConvertir0A_0() {
        assertEquals("0", conversor.convertirABase5(0));
    }

    // --- Números Positivos Simples (menores que la base) ---
    @Test
    @DisplayName("1 debería convertirse a \"1\"")
    void pruebaConvertir1A_1() {
        assertEquals("1", conversor.convertirABase5(1));
    }

    @Test
    @DisplayName("2 debería convertirse a \"2\"")
    void pruebaConvertir2A_2() {
        assertEquals("2", conversor.convertirABase5(2));
    }

    @Test
    @DisplayName("3 debería convertirse a \"3\"")
    void pruebaConvertir3A_3() {
        assertEquals("3", conversor.convertirABase5(3));
    }

    @Test
    @DisplayName("4 debería convertirse a \"4\"")
    void pruebaConvertir4A_4() {
        assertEquals("4", conversor.convertirABase5(4));
    }

    // --- Primer Rollover (igual a la base) ---
    @Test
    @DisplayName("5 debería convertirse a \"10\"")
    void pruebaConvertir5A_10() {
        assertEquals("10", conversor.convertirABase5(5));
    }

    // --- Números Positivos de Varios Dígitos ---
    @Test
    @DisplayName("6 debería convertirse a \"11\"")
    void pruebaConvertir6A_11() {
        assertEquals("11", conversor.convertirABase5(6)); // 1*5 + 1*1
    }

    @Test
    @DisplayName("9 debería convertirse a \"14\"")
    void pruebaConvertir9A_14() {
        assertEquals("14", conversor.convertirABase5(9)); // 1*5 + 4*1
    }

    @Test
    @DisplayName("10 debería convertirse a \"20\"")
    void pruebaConvertir10A_20() {
        assertEquals("20", conversor.convertirABase5(10)); // 2*5 + 0*1
    }

    @Test
    @DisplayName("24 debería convertirse a \"44\"")
    void pruebaConvertir24A_44() {
        assertEquals("44", conversor.convertirABase5(24)); // 4*5 + 4*1
    }

    @Test
    @DisplayName("25 debería convertirse a \"100\"")
    void pruebaConvertir25A_100() {
        assertEquals("100", conversor.convertirABase5(25)); // 1*25 + 0*5 + 0*1
    }

    @Test
    @DisplayName("78 debería convertirse a \"303\"")
    void pruebaConvertir78A_303() {
        assertEquals("303", conversor.convertirABase5(78)); // 3*25 + 0*5 + 3*1
    }

     @Test
    @DisplayName("126 debería convertirse a \"1001\"")
    void pruebaConvertir126A_1001() {
        assertEquals("1001", conversor.convertirABase5(126)); // 1*125 + 0*25 + 0*5 + 1*1
    }


    // --- Números Negativos ---

    @Test
    @DisplayName("-1 debería convertirse a \"-1\"")
    void pruebaConvertirMenos1A_Menos1() {
        assertEquals("-1", conversor.convertirABase5(-1));
    }

    @Test
    @DisplayName("-4 debería convertirse a \"-4\"")
    void pruebaConvertirMenos4A_Menos4() {
        assertEquals("-4", conversor.convertirABase5(-4));
    }

    @Test
    @DisplayName("-5 debería convertirse a \"-10\"")
    void pruebaConvertirMenos5A_Menos10() {
        assertEquals("-10", conversor.convertirABase5(-5));
    }

    @Test
    @DisplayName("-24 debería convertirse a \"-44\"")
    void pruebaConvertirMenos24A_Menos44() {
        assertEquals("-44", conversor.convertirABase5(-24));
    }

    @Test
    @DisplayName("-25 debería convertirse a \"-100\"")
    void pruebaConvertirMenos25A_Menos100() {
        assertEquals("-100", conversor.convertirABase5(-25));
    }

    @Test
    @DisplayName("-126 debería convertirse a \"-1001\"")
    void pruebaConvertirMenos126A_Menos1001() {
        assertEquals("-1001", conversor.convertirABase5(-126));
    }

    // Nota: No hay límites superiores estrictos como en los romanos (aparte de Integer.MAX_VALUE),
    // por lo que no se necesitan pruebas específicas para 4000 o similares.
}
