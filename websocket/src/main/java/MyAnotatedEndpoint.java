import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;

@ServerEndpoint("/myendpoint/{param}/{param2}")
public class MyAnotatedEndpoint {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("onOpen");
    }

    // для проверки открыть G:\Documents\JavaProject\JavaEEtest\java\websocket\websocket.html
    @OnMessage
    public void onMessage(Session session, String msg, @PathParam("param") String param, @PathParam("param2") String param2) throws IOException, EncodeException {
        System.out.println("onMessage");
        System.out.println(msg);
        System.out.println("param = " + param);
        System.out.println("param2 = " + param2);
        session.getBasicRemote().sendText("you send " + msg);
    }

    @OnMessage
    public void onMessageBinary(Session session, ByteBuffer msg) throws IOException {
        System.out.println("onMessageBinary");
        session.getBasicRemote().sendBinary(msg);
    }

    @OnError
    public void onError(Session session, Throwable t) {
        System.out.println("onError");
        t.printStackTrace();
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("onClose");
    }
}
