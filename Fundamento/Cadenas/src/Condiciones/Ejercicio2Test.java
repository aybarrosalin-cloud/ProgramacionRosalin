package Condiciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void upcTest() {
        assertTrue(Ejercicio2.upc("116"));
        assertFalse(Ejercicio2.upc("111"));
        assertTrue(Ejercicio2.upc("019"));
        assertTrue(Ejercicio2.upc("107"));
        assertTrue(Ejercicio2.upc("240"));
        assertTrue(Ejercicio2.upc("036000241457"));
    }
}
