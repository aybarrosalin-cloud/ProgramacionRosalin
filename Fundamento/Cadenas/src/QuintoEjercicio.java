public class QuintoEjercicio {
    public static void main(String[] args) {
        System.out.println(terminaenS("No me gustA el POLLo"));
    }
    static public
    boolean terminaenS(String texto) {
        var ultimoCaracter = texto.charAt(texto.length()- 1);
        return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
}
}