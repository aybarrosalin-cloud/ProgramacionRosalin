package Condicionesybucles;

public class Ejercicio1C {
    public static boolean tresdigitos(int n) {
        if (n >= 100 && n <= 999)
        { System.out.println("Tiene tres numeros linda");
            return true;
        }
        else {
            System.out.println("No tienes tres numeros linda");
            return false;
        }
    }
}