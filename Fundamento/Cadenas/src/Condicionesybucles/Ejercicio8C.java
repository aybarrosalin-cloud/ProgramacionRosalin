package Condicionesybucles;
public class Ejercicio8C {
        public static boolean multiplo(int n) {
            if (n < 0) n = -n;
            if (n < 10 || n > 99) return false;
            int d1 = n / 10;
            int d2 = n % 10;
            if (d1 == 0 || d2 == 0) return false; //REVISA LA ADVERTENCIA
            return (d1 % d2 == 0) || (d2 % d1 == 0);
        }
}
