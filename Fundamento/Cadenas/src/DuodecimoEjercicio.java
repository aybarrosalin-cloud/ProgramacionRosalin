public class DuodecimoEjercicio {
    public static void main(String[] args) {
        var mensaje = correovalido("abc@me.com");
        System.out.println(mensaje);
    }public static boolean correovalido(String correo) {
        var posicionarroba = correo.indexOf("@");
        var ultimaarroba = correo.lastIndexOf("@");
        var puntodespues = correo.indexOf(".", posicionarroba + 1);
        var ultimoPunto = correo.lastIndexOf(".");
        return posicionarroba > 0 &&
                posicionarroba == ultimaarroba &&
                puntodespues > posicionarroba + 1 &&
                ultimoPunto < correo.length() - 1 &&
                puntodespues - posicionarroba > 1 &&
                !correo.contains("..");
    }
}