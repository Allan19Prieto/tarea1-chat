
import  java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader input;

    public void starConnection(String ipAddress, Integer port) throws IOException{
        clientSocket = new Socket(ipAddress, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Cliente connected!...");
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        return input.readLine();
    }

    public void stopConnection() throws IOException {
        input.close();
        out.close();
        clientSocket.close();
        System.out.println("Client disconnected!...");
    }
}
