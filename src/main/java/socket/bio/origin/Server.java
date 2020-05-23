package socket.bio.origin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import socket.bio.Message;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket socket = new ServerSocket(8000);

        while (true) {
            Socket clientSocket = socket.accept();
            try (ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream())) {
                byte[] bytes = new byte[1024];
                Message object = (Message) inputStream.readObject();
                System.out.println(object.value);
            }
        }
    }
}