
import java.io.*;
import java.net.*;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader input;

    public void  listen(int port) throws  IOException{
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String mgs = input.readLine();

        //Se emprime el mensage qeu llega
        System.out.println("Client: "+mgs);
        out.println("Hello from de server");
    }

    public void stop() throws  IOException {
        input.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.listen(8080);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
