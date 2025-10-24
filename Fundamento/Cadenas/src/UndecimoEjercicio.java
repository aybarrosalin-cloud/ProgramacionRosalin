public class UndecimoEjercicio {
    public static void main(String[] args) {
        var mensaje = RGBaHex(255, 255, 255);
        System.out.println(mensaje);
    }public static String RGBaHex(int r, int g, int b) {
        var rojo = String.format("%02X", r);
        var verde = String.format("%02X", g);
        var azul = String.format("%02X", b);
        return rojo + verde + azul;
    }
}
