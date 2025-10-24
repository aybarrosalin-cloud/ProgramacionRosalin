package Condicionesybucles;

public class Ejercicio6C {

    public static boolean primoNegativo(int n) {
        if ((n > -10 && n < 10) || n == 0) return false; // no tiene 2 digitos
        int num = n < 0 ? -n : n;

        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) primo = false;
        }

        return primo && n < 0;
    }
}

