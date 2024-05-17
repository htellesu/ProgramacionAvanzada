import java.io.*;
import java.net.*;

public class Conexion{
	//configuración de la aplicacion
	final String host = "localhost";
 	final int port = 1234;
	protected Socket socketCliente;
	protected ServerSocket socketServidor;
	protected DataOutputStream mensajeAEnviar;
	protected DataOutputStream salidaAEnviar;
	
	//clases
	public Conexion(String tipo) throws IOException{
		if(tipo == "servidor"){
			socketServidor  = new ServerSocket(port);
			socketCliente = new Socket();
		}else{
			socketCliente = new Socket(host, port);
		}
	}
	
}