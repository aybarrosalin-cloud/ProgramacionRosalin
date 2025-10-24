package Condicionesybucles;
public class Ejercicio6B {
    {
        int n = 523;
        if (n < 0) n = n * -1;  // LLEVA a positivo
        if (n > 99 && n < 1000) {
            int d1 = n / 100;
            int d2 = (n / 10) % 10;
            int d3 = n % 10;
            for (int i = 1; i <= d1; i++) System.out.print(i + " ");
            System.out.println(); //IMPRiME
            for (int i = 1; i <= d2; i++) System.out.print(i + " ");
            System.out.println(); //IMP
            for (int i = 1; i <= d3; i++) System.out.print(i + " ");
        }
    }
}
