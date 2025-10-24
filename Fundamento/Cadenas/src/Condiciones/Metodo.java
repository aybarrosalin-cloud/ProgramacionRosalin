package Condiciones;
import java.util.Scanner;
public class Metodo {
    public static int CalcularEdad(int nacimientoano, int anoactual) {
        if (nacimientoano >= anoactual) {
            System.out.println("Aun no se puede calcular");
            return 0;
        } else {
            return nacimientoano - anoactual;
        }
    }
}
