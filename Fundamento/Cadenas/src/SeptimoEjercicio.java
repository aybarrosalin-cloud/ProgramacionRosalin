public class SeptimoEjercicio {
    public static void main(String[] args) {
        var mensaje = esExterno("definetely-internal");
        System.out.println(mensaje);
    }
    public static boolean esExterno(String direccion) {
        return direccion.startsWith("http");
    }
}

