import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class APIHandler {
    public static String makeRequest(String url, HashMap<String, String> headers) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(URI.create(url));

        // Add headers to HTTP request
        for (String header : headers.keySet()) {
            System.out.println(header);
            System.out.println(headers.get(header));
            requestBuilder.setHeader(header, headers.get(header));
        }

        HttpRequest request = requestBuilder.build();

        HttpResponse<String> result = null;

        // Unsafe code but for the time being, it works and we don't really want to or care to show errors of this sort to the user
        try {
            result = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (result != null) {
            return result.body();
        } else {
            return "";
        }
    }
}
