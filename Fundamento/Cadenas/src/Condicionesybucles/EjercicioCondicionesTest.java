package Condicionesybucles;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EjercicioCondicionesTest {
    @Test
    void testTresDigitos() {
        assertTrue(Ejercicio1C.tresdigitos(456));
        assertFalse(Ejercicio1C.tresdigitos(45));
    }
    @Test
    void testNegativo() {
        assertTrue(Ejercicio2C.negativo(-9));
        assertFalse(Ejercicio2C.negativo(8));
    }
    @Test
    void testSumaDosDigitos() {
        assertEquals(9, Ejercicio3C.sumaDosDigitos(54), "5 + 4 = 9");
        assertEquals(1, Ejercicio3C.sumaDosDigitos(10), "1 + 0 = 1");
    }
    @Test
    void testMenor20yPrimo() {
        assertTrue(Ejercicio4C.menor20yPrimo(11));
        assertTrue(Ejercicio4C.menor20yPrimo(13));
        assertTrue(Ejercicio4C.menor20yPrimo(17));
        assertFalse(Ejercicio4C.menor20yPrimo(21)); // ejemplo que no eta vaina// cumple
    }
    @Test
    void testAmbosPares() {
        assertTrue(Ejercicio5C.ambospares(24));
        assertFalse(Ejercicio5C.ambospares(25));
    }
    @Test
    @DisplayName("Ejercicio6C: -13 es primo negativo de dos cifras")
    void testEjercicio6C() {
        assertTrue(Ejercicio6C.primoNegativo(-13));
    }

    @Test
    @DisplayName("Ejercicio7C: 23 tiene dos digitos primos")
    void testEjercicio7C() {
        assertTrue(Ejercicio7C.dosPrimos(23));
    }

    @Test
    @DisplayName("Ejercicio8C: 42 tiene digitos multiplos entre si")
    void testEjercicio8C() {
        assertTrue(Ejercicio8C.multiplo(42));
    }

    @Test
    @DisplayName("Ejercicio9C: 77 tiene digitos iguales")
    void testEjercicio9C() {
        assertTrue(Ejercicio9C.iguales(77));
    }

        @Test
        @DisplayName("1B contar desde 1 hasta n")
        void testContarHasta() {
            assertEquals("1 2 3 4 5", Ejercicio1B.contarHasta(5));
        }

        @Test
        @DisplayName("2B mostrar pares hasta n")
        void testMostrarParesHasta() {
            assertEquals("2 4 6 8 10", Ejercicio2B.mostrarParesHasta(10));
        }

        @Test
        @DisplayName("3B divisores de un numero")
        void testDivisores() {
            assertEquals("1 2 3 6", Ejercicio3B.divisores(6));
            assertEquals("1 5", Ejercicio3B.divisores(5));
        }

        @Test
        @DisplayName("4B numeros entre dos valores (sin importar el orden)")
        void testEntreNumeros() {
            assertEquals("3 4 5 6 7", Ejercicio4B.entreNumeros(3,7));
            assertEquals("3 4 5 6 7", Ejercicio4B.entreNumeros(7,3));
        }

        @Test
        @DisplayName("5B numeros terminados en 4 entre dos valores")
        void testTerminadosEn4() {
            assertEquals("4 14 24", Ejercicio5B.terminadosEn4(1,25));
        }

        @Test
        @DisplayName("6B mostrar del 1 hasta cada digito de un numero de tres digitos")
        void testMostrarHastaCadaDigito() {

        }

        @Test
        @DisplayName("7B mostrar enteros del 1 al 100")
        void testMostrar1a100() {

        }

        @Test
        @DisplayName("8B mostrar pares del 20 al 200")
        void testPares20a200() {

        }

        @Test
        @DisplayName("9B mostrar numeros terminados en 6 (25 a 205)")
        void testTerminadosEn6() {

        }

        @Test
        @DisplayName("10B sumar del 1 hasta n")
        void testSumaHasta() {
            assertEquals(15, Ejercicio10B.sumaHasta(5));
            assertEquals(55, Ejercicio10B.sumaHasta(10));
        }
    }




