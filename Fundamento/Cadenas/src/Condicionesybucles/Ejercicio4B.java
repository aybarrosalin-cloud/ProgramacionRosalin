package Condicionesybucles;

public class Ejercicio4B {
    public static String entreNumeros(int a, int b) {
        String r = "";
        if (a < b)
            for (int i = a; i <= b; i++) r += i + " ";
        else
            for (int i = b; i <= a; i++) r += i + " ";
        return r.trim();
    }
}

