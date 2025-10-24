package Condicionesybucles;

public class Ejercicio5C {
    public static boolean ambospares(int num) {
        if (num < 0) num = -num;
        int d1 = num / 10;
        int d2 = num % 10;
        return (d1 % 2 == 0) && (d2 % 2 == 0);
    }
}
// REVISR EL OPERADOR LOGICO, A VER QUE ES LO QUE PASA EL TEST