package edu.uvm.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas del Conversor de Números Romanos (con negativos)")
class ConversorNumeroRomanoTest {

    private ConversorNumeroRomano conversor;

    @BeforeEach
    void inicializar() {
        conversor = new ConversorNumeroRomano();
    }

    // --- Pruebas para números POSITIVOS (sin cambios) ---
    @Test
    @DisplayName("1 debería convertirse a I")
    void pruebaConvertir1A_I() { assertEquals("I", conversor.convertirARomano(1)); }

    @Test
    @DisplayName("4 debería convertirse a IV")
    void pruebaConvertir4A_IV() { assertEquals("IV", conversor.convertirARomano(4)); }

    @Test
    @DisplayName("9 debería convertirse a IX")
    void pruebaConvertir9A_IX() { assertEquals("IX", conversor.convertirARomano(9)); }

    @Test
    @DisplayName("40 debería convertirse a XL")
    void pruebaConvertir40A_XL() { assertEquals("XL", conversor.convertirARomano(40)); }

    @Test
    @DisplayName("99 debería convertirse a XCIX")
    void pruebaConvertir99A_XCIX() { assertEquals("XCIX", conversor.convertirARomano(99)); }

    @Test
    @DisplayName("400 debería convertirse a CD")
    void pruebaConvertir400A_CD() { assertEquals("CD", conversor.convertirARomano(400)); }

    @Test
    @DisplayName("900 debería convertirse a CM")
    void pruebaConvertir900A_CM() { assertEquals("CM", conversor.convertirARomano(900)); }

    @Test
    @DisplayName("1024 debería convertirse a MXXIV")
    void pruebaConvertir1024A_MXXIV() { assertEquals("MXXIV", conversor.convertirARomano(1024)); }

    @Test
    @DisplayName("3999 debería convertirse a MMMCMXCIX")
    void pruebaConvertir3999A_MMMCMXCIX() { assertEquals("MMMCMXCIX", conversor.convertirARomano(3999)); }

    // --- NUEVAS Pruebas para números NEGATIVOS ---

    @Test
    @DisplayName("-1 debería convertirse a -I")
    void pruebaConvertirMenos1A_MenosI() {
        assertEquals("-I", conversor.convertirARomano(-1));
    }

    @Test
    @DisplayName("-2 debería convertirse a -II")
    void pruebaConvertirMenos2A_MenosII() {
        assertEquals("-II", conversor.convertirARomano(-2));
    }

    @Test
    @DisplayName("-4 debería convertirse a -IV")
    void pruebaConvertirMenos4A_MenosIV() {
        assertEquals("-IV", conversor.convertirARomano(-4));
    }

     @Test
    @DisplayName("-9 debería convertirse a -IX")
    void pruebaConvertirMenos9A_MenosIX() {
        assertEquals("-IX", conversor.convertirARomano(-9));
    }

    @Test
    @DisplayName("-14 debería convertirse a -XIV")
    void pruebaConvertirMenos14A_MenosXIV() {
        assertEquals("-XIV", conversor.convertirARomano(-14));
    }

    @Test
    @DisplayName("-40 debería convertirse a -XL")
    void pruebaConvertirMenos40A_MenosXL() {
        assertEquals("-XL", conversor.convertirARomano(-40));
    }

    @Test
    @DisplayName("-99 debería convertirse a -XCIX")
    void pruebaConvertirMenos99A_MenosXCIX() {
        assertEquals("-XCIX", conversor.convertirARomano(-99));
    }

     @Test
    @DisplayName("-400 debería convertirse a -CD")
    void pruebaConvertirMenos400A_MenosCD() {
        assertEquals("-CD", conversor.convertirARomano(-400));
    }

    @Test
    @DisplayName("-900 debería convertirse a -CM")
    void pruebaConvertirMenos900A_MenosCM() {
        assertEquals("-CM", conversor.convertirARomano(-900));
    }

    @Test
    @DisplayName("-1024 debería convertirse a -MXXIV")
    void pruebaConvertirMenos1024A_MenosMXXIV() {
        assertEquals("-MXXIV", conversor.convertirARomano(-1024));
    }

    @Test
    @DisplayName("-3999 debería convertirse a -MMMCMXCIX")
    void pruebaConvertirMenos3999A_MenosMMMCMXCIX() {
        assertEquals("-MMMCMXCIX", conversor.convertirARomano(-3999));
    }


    // --- Pruebas para casos INVÁLIDOS (actualizadas/añadidas) ---

    @Test
    @DisplayName("0 debería lanzar IllegalArgumentException")
    void pruebaConvertir0LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.convertirARomano(0);
        }, "El cero no es un número romano válido");
    }

    @Test
    @DisplayName("4000 debería lanzar IllegalArgumentException")
    void pruebaConvertir4000LanzaExcepcion() {
         assertThrows(IllegalArgumentException.class, () -> {
            conversor.convertirARomano(4000);
        }, "Números >= 4000 no son válidos");
    }

    @Test
    @DisplayName("-4000 debería lanzar IllegalArgumentException")
    void pruebaConvertirMenos4000LanzaExcepcion() {
         assertThrows(IllegalArgumentException.class, () -> {
            conversor.convertirARomano(-4000);
        }, "Números <= -4000 no son válidos");
    }
}
