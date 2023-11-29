package Cliente;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author DAM_M
 */
public class ClientePSP {

    /**
     * @param args the command line arguments
     */
    static final String HOST = "localHost";
    static final int Puerto = 2000;

    public ClientePSP() {
        try {
            Socket sCliente = new Socket(HOST, Puerto);
            InputStream aux = sCliente.getInputStream();
            DataInputStream flujo_entrada = new DataInputStream(aux);
            System.out.println(flujo_entrada.readUTF());
            sCliente.close();

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new ClientePSP();
    }

}
