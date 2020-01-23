import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

@ClientEndpoint
public class MyClient {
    @OnMessage
    public void onMessage(Session session, String message) {
        System.out.println("Client get message " + message);
    }

    public static void main(String[] st) throws IOException, DeploymentException, InterruptedException {
        System.out.println("MMMain");
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(MyClient.class, URI.create("ws://localhost:8080/websocket/myendpoint/paramtest/secondparamtest"));
        session.getBasicRemote().sendText("Hello my websocet app");
        Thread.sleep(100);
        session.close();
    }
}
