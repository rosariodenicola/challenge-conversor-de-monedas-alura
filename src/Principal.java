import Java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
    }
}


public static double obtenerTasa(String urlFinal) throws IOException, InterruptedException {
    //Código omitido
    //Conversión a JSON
    JsonElement elemento = JsonParser.parseString(respuesta.body());
    JsonObject objectRoot = elemento.getAsJsonObject();

    //Accediendo a JsonObject
    double tasa = objectRoot.get("conversion_rates").getAsDouble();
    return tasa;
}
}



public static void convertir(String monedaBase, String moendaTarget, ConsultarMoneda moneda, Scanner lectura);
public class currencyCode = currencyCode.get("conversion_rates");