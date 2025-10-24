public class SegundoEjercicio {
    public static void main(String[] args){
        System.out.println(pluralizar(7, "Arlet"));
    }
    public static String pluralizar(int conteo, String s) {
        return(conteo<2)?s: String.format("%d %ss", conteo, s);
    }
}

