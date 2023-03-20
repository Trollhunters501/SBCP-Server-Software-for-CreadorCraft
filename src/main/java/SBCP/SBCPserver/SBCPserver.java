package SBCP.SBCPserver;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/creadorcraftserver")
public class SBCPserver {
  @OnOpen
  public void onOpen(Session session) {
    try {
      session.getBasicRemote().sendText("Hola desde el servidor");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  @OnClose
  public void onClose(Session session) {
    // Mostrar un mensaje en la consola cuando se cierra la conexión
    System.out.println("Conexión cerrada");
  }
  @OnError
  public void onError(Throwable error) {
    System.out.println("Error: " + error.getMessage());
    
  }
}
