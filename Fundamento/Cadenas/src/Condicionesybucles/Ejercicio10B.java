package Condicionesybucles;
public class Ejercicio10B {
    public static int sumaHasta(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) suma = suma + i;
        return suma;
    }
    public static void main(String[] args) {
        int n = 5;
        int resultado = sumaHasta(n);
        System.out.println(resultado);
    }
}
