import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
public Moneda buscaMoneda(String tipoDeMoneda){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7fc2728695be56f7136bb2e5/latest/"+tipoDeMoneda);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();
    try {
        HttpResponse<String> response = null;
        response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Moneda.class);
    } catch (IOException | InterruptedException e) {
        throw new RuntimeException("No enconmtre esa Moneda");
    }
}
}
