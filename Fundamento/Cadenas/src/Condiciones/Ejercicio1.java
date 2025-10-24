package Condiciones;

public class Ejercicio1 {

    static boolean esPrimo(int n) {
        if (n <= 1) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

