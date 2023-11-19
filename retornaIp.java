import java.net.InetAddress;
import java.net.UnknownHostException;

public class retornaIp {
    public static void main(String[] args) throws UnknownHostException, UnknownHostException {
        //pegamos o ip da maquina.
        String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ipDaMaquina);

    }
}
