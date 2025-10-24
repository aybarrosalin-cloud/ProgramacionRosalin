public class SextoEjercicio {
    public static void main(String[] args) {
        var impresion = esPalindromo("Ana");
        System.out.println(impresion);}
    public static boolean esPalindromo(String textoEntrada) {
        var normalizado = textoEntrada.toLowerCase();
        var invertido = new StringBuilder(normalizado).reverse().toString();
        return normalizado.equals(invertido);}
}
//jshell> Boolean esPalindrome (String texto){
//   ...>     String inv = new StringBuilder(texto).reverse().toString();
//   ...>     return texto.equalsIgnoreCase(inv);
//   ...> }
//|  created method esPalindrome(String)