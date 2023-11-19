import java.net.InetAddress;
import java.net.UnknownHostException;

public class retornaUser {
    public static void main(String[] args) throws UnknownHostException {
        //nome da maquina.
        String nomeDaMaquina = InetAddress.getLocalHost().getHostName();
        System.out.println(nomeDaMaquina);
    }
}
