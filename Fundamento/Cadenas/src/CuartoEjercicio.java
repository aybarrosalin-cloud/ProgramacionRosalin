public class CuartoEjercicio {
    public static void main(String[] args) {
        String impresion=titleCase("java");
        System.out.println(impresion);}
    public static String titleCase(String texto) {
        var primeraLetra=texto.substring(0,1);
        var restoDelTexto=texto.substring(1);
        return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
}
}