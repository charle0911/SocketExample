package socket.bio.rpc;

import socket.bio.Message;

public class ExampleClient {
    public static void main(String[] args) {
        ExampleService service = new ExampleServiceClientImpl();
        Message message = service.invoke();
        System.out.println(message.value);
    }
}
