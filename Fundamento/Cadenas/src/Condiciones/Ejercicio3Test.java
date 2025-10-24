package Condiciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    void contrasenaFuerte() {
        assertTrue(Ejercicio3.contrasenaFuerte("Abc123$ "));
        assertTrue(Ejercicio3.contrasenaFuerte("ABC123$ "));
        assertFalse(Ejercicio3.contrasenaFuerte("Abc12345"));
        assertFalse(Ejercicio3.contrasenaFuerte("abc123$"));
    }
}
