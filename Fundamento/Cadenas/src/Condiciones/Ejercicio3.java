package Condiciones;
public class Ejercicio3 {
    public static boolean contrasenaFuerte(String c) {
        if (c.length() < 8) return false;
        boolean mayuscula = false, num = false, simb = false;
        for (char ch:c.toCharArray()) {
            if (Character.isUpperCase(ch)) mayuscula = true;
            if (Character.isDigit(ch)) num = true;
            if (!Character.isLetterOrDigit(ch)) simb = true;
        }
        return mayuscula && num && simb;
    }
}