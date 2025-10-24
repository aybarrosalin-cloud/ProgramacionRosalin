public class TercerEjercicio {
    public static void main(String[] args) {
        System.out.println(esVocal('Q')); // false
    }

    static boolean esVocal(char letra) {
        var letraMinuscula = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMinuscula));
}
}

