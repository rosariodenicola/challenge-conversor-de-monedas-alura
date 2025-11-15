import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget,
                                 ConsultarMoneda consultar, Scanner lectura) {

        Monedas monedas = consultar.consultarMoneda(monedaBase, monedaTarget);

        if (monedas == null) {
            System.out.println("No se encontró la moneda.");
            return;
        }

        System.out.println("La tasa de conversión para hoy será:");
        System.out.println("1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);

        System.out.println("Ingrese la cantidad de " + monedaBase + ": ");
        double cantidad = Double.parseDouble(lectura.nextLine());

        double cantidadConvertida = cantidad * monedas.conversion_rate();

        System.out.println(cantidad + " " + monedaBase + " = " +
                cantidadConvertida + " " + monedas.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consultarMoneda, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();

        System.out.println("Ingrese la moneda a la que quiere convertir: ");
        String monedaTarget = lectura.nextLine().toUpperCase();

        convertir(monedaBase, monedaTarget, consultarMoneda, lectura);
    }


    // Mapa opcional extra
    public static class CurrencyCode {

        private static final Map<String, MonedaInfo> MONEDAS = new HashMap<>();

        static {
            MONEDAS.put("USD", new MonedaInfo("USD", "Dolar", "$", 1.0));
            MONEDAS.put("BOB", new MonedaInfo("BOB", "Boliviano boliviano", "$b.", 6.9227));
            MONEDAS.put("BRL", new MonedaInfo("BRL", "Real brasileño", "R$", 5.2918));
            MONEDAS.put("CLP", new MonedaInfo("CLP", "Peso chileno", "CLP$", 929.9919));
            MONEDAS.put("COP", new MonedaInfo("COP", "Peso colombiano", "$", 3706.5341));
            MONEDAS.put("ARS", new MonedaInfo("ARS", "Peso argentino", "$", 1408.83));
        }

        public static MonedaInfo get(String codigo) {
            return MONEDAS.get(codigo.toUpperCase());
        }
    }

    public static class MonedaInfo {
        private String codigo;
        private String nombre;
        private String simbolo;
        private double cantidad;

        public MonedaInfo(String codigo, String nombre, String simbolo, double cantidad) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.simbolo = simbolo;
            this.cantidad = cantidad;
        }

        public String getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public String getSimbolo() { return simbolo; }
        public double getCantidad() { return cantidad; }
    }
}