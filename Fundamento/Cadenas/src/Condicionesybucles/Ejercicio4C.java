package Condicionesybucles;

public class Ejercicio4C {
        public static boolean menor20yPrimo(int n) {
            if (n >= 20 || n < 10) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


