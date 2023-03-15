import java.net.HttpURLConnection;
import java.net.URL;

public class Error404 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.example.com/page_does_not_exist");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        if (responseCode == 404) {
            System.out.println("404 Error: Page not found");
        }
    }
}

//Ignore it
