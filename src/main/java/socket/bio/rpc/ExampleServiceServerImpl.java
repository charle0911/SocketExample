package socket.bio.rpc;

import socket.bio.Message;

public class ExampleServiceServerImpl implements ExampleService{
    @Override
    public Message invoke() {
        Message message = new Message();
        message.value = "success";
        return message;
    }
}
