public class PrimerEjercicio {
    public static void main(String[] args) {
        System.out.println(empiezaMinuscula("Dilianny"));
    }

    public static boolean empiezaMinuscula(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}