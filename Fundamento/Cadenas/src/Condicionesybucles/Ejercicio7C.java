package Condicionesybucles;
public class Ejercicio7C {
        public static boolean dosPrimos(int n) {
            if (n < 0) n = -n; // convertir a positivo
            if (n < 10 || n > 99) return false;
            int d1 = n / 10;
            int d2 = n % 10;
            return esPrimo(d1) && esPrimo(d2);}
        static boolean esPrimo(int x) {
            if (x < 2) return false;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) return false;
            }
            return true;
        }
    }
