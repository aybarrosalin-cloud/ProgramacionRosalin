package Condicionesybucles;

public class Ejercicio3B {
    public static String divisores(int n) {
        String r = "";
        for (int i = 1; i <= n; i++) if (n % i == 0) r += i + " ";
        return r.trim();
    }
}