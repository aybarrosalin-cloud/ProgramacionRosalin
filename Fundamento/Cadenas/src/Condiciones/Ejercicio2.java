package Condiciones;
public class Ejercicio2 {
        public static boolean upc(String numero) {
  int longitud = numero.length();
  int verificar = numero.charAt(longitud - 1) - '0';
 int sumaimpar = 0, sumapar = 0;
            for (int i = 0; i < longitud - 1; i++){
   int dig = numero.charAt(i) - '0';
    if (i % 2 == 0) sumaimpar += dig;
    else sumapar += dig;
            }
            int total = sumaimpar * 3 + sumapar;
 int calcular = (10 - (total % 10)) % 10;
            return calcular == verificar;
        }
}
