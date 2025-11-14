import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;

public class ConsultarMoneda {
    public static void main(String[] args) throws IOException, InterruptedException, RunTimeException,  {
        ConsultarMoneda.eleccionUserMenu();
    }
JsonElement elemento = JsonParser.parseString(respuesta.body());
JsonObject objectRoot = elemento.getAsJsonObject();

//Accediendo a JsonObject
double tasa = objectRoot.get("conversion_rates").getAsDouble();
    return tasa;
}

    HttpClient cliente = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://v6.exchangerate-api.com/v6/3e39541da72768c519af2b34/latest/USD/"+monedaBase"/"+monedaTarget));
        .GET()
        .build();
    HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());

try {
HttpResponse<String> respuesta = cliente.send(request, HttpResponse.BodyHandlers.ofString());
catch (Exception e){
    throw new RunTimeException("No encontré la moneda");
        }