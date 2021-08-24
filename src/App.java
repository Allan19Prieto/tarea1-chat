
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.startConnection("127.0.0.1",8080);
            String msg = client.sendMessage("Hello from client!");
            System.out.println("Server: "+msg);
            client.stopConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
