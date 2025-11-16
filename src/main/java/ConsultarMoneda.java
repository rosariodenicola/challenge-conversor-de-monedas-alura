import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    private static final String API_KEY = "3e39541da72768c519af2b34";

    public Monedas consultarMoneda(String monedaBase, String monedaTarget) {

        HttpClient cliente = HttpClient.newHttpClient();

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY +
                "/pair/" + monedaBase + "/" + monedaTarget;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            HttpResponse<String> response =
                    cliente.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("JSON recibido:");
            //System.out.println(response.body());

            JsonObject json = new Gson().fromJson(response.body(), JsonObject.class);

            if (!json.get("result").getAsString().equals("success")) {
                throw new RuntimeException("No pude obtener datos de la moneda.");
            }

            double tasa = json.get("conversion_rate").getAsDouble();

            return new Monedas(monedaBase, monedaTarget, tasa);

        } catch (Exception e) {
            throw new RuntimeException("Error consultando API: " + e.getMessage());
        }
    }
}
