package Condiciones;

public class Ejercicio4 {

    public static String camelASerpiente(String texto) {
        StringBuilder res = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append("_").append(Character.toLowerCase(c));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static String serpienteACamel(String texto) {
        StringBuilder res = new StringBuilder();
        boolean mayus = false;
        for (char c : texto.toCharArray()) {
            if (c == '_') {
                mayus = true;
            } else {
                res.append(mayus ? Character.toUpperCase(c) : c);
                mayus = false;
            }
        }
        return res.toString();
    }

    public static class ConvertidorTest {
        public class Convertidor {

            public static String camelASerpiente(String texto) {
                StringBuilder res = new StringBuilder();
                for (char c : texto.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        res.append("_").append(Character.toLowerCase(c));
                    } else {
                        res.append(c);
                    }
                }
                return res.toString();
            }

            public static String serpienteACamel(String texto) {
                StringBuilder res = new StringBuilder();
                boolean mayus = false;
                for (char c : texto.toCharArray()) {
                    if (c == '_') {
                        mayus = true;
                    } else {
                        res.append(mayus ? Character.toUpperCase(c) : c);
                        mayus = false;
                    }
                }
                return res.toString();
            }

            public static class Ejercicio4Test {
                {
                }
            }
        }
    }
}
