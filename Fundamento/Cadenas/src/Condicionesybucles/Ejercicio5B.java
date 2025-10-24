package Condicionesybucles;

public class Ejercicio5B {
    public static String terminadosEn4(int a, int b) {
        String r = "";
        for (int i = a; i <= b; i++) if (i % 10 == 4) r += i + " ";
        return r.trim();
    }
}

