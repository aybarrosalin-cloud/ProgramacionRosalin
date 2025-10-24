public class NovenoEjercicio {
    public static void main(String[] args) {
        var mensaje = domain("https://jcp.org");
        System.out.println(mensaje);
    } public static String domain(String url) {
        var inicio = "https://".length();
        var termina = url.indexOf("/", inicio);
        return termina >=0?url.substring(inicio, termina):url.substring(inicio);
    }
}