package Condiciones;

import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    @Test
    void testEsPrimo() {
        assertTrue(Ejercicio1.esPrimo(1));
        assertTrue(Ejercicio1.esPrimo(7));
        assertFalse(Ejercicio1.esPrimo(100));
    }
}
