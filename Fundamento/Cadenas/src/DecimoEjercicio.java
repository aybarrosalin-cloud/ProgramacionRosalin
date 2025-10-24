public class DecimoEjercicio {
    public static void main(String[] args) {
        var mensaje = DomingoPascua(2026);
        System.out.println(mensaje);}
    public static String DomingoPascua(int año) {
        var a = año % 19;
        var b = año / 100;
        var c = año % 100;
        var d = b / 4;
        var e = b % 4;
        var f = (b + 8) / 25;
        var g = (b - f + 1) / 3;
        var h = (19 * a + b - d - g + 15) % 30;
        var i = c / 4;
        var k = c % 4;
        var l = (32 + 2 * e + 2 * i - h - k) % 7;
        var m = (a + 11 * h + 22 * l) / 451;
        var n = (h + l - 7 * m + 114) / 31;
        var p = (h + l - 7 * m + 114) % 31;
        var mes = String.format("%02d", n);
        var dia = String.format("%02d", p + 1);
        return String.format("%d/%s/%s", año, mes, dia);}
}
