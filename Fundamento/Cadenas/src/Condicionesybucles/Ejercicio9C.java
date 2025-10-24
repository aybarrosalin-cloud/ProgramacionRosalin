package Condicionesybucles;

public class Ejercicio9C {
    public static boolean iguales(int n) {
        if (n < 0) n = -n;
        if (n < 10 || n > 99) return false;
        int d1 = n / 10;
        int d2 = n % 10;
        return d1 == d2;
    }
}
