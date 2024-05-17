import java.net.*;
import java.io.*;

public class ClientHandler implements Runnable{
	private Socket clientSocket;
	
	ClientHandler(Socket socket){
		this.clientSocket = socket;
	}
	
	public void run(){
		try{
			PrintWriter mensajeSalida = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader mensajeEntrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String mensaje;
			while((mensaje = mensajeEntrada.readLine()) != null){
				System.out.println("Recibe " + mensaje);
				mensajeSalida.println("Repetidor: "+ mensaje);
			}
			mensajeEntrada.close();
			mensajeSalida.close();
			clientSocket.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}