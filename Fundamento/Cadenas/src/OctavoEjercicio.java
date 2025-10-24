public class OctavoEjercicio {
    public static void main(String[] args) {
        var mensaje = extension("path/to/debug.sh");
        System.out.println(mensaje);}
    public static String extension(String rutadearchivo) {
        var posicionpunto = rutadearchivo.lastIndexOf('.');
        var resultados = posicionpunto >= 0 ? rutadearchivo.substring(posicionpunto + 1) : "";
        return resultados;
    }
}