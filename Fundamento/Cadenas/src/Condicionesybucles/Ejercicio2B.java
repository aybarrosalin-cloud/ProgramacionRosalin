package Condicionesybucles;

public class Ejercicio2B {
    public static String mostrarParesHasta(int n) {
        String r = "";
        for (int i = 2; i <= n; i += 2) r += i + " ";
        return r.trim();
    }
}


