import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        var url = "https://imdb-api.com/en/API/Top250Movies/API_KEY";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        var response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }



}
