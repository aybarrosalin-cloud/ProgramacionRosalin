public class DecimoterceroEjercicio {
    public static void main(String[] args) {
        var mensaje = ellipsis("Java is fun", 6);
        System.out.println(mensaje);
    } public static String ellipsis(String texto, int limite) {
        var espacio = texto.indexOf(" ", limite);
        var puntos = "\u2026";
        var resultado=espacio>=0
                ? texto.substring(0,espacio)+puntos
                : texto.length()>limite
                ? texto+puntos
                : texto;
        return resultado;
    }
}
