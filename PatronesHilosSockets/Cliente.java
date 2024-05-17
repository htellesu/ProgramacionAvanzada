import java.net.*;
import java.io.*;

public class Cliente{
	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("localhost", 12345);
		PrintWriter mensajeSalida = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader mensajeEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		System.out.println("Bienvenido al Servidor");
		mensajeSalida.println("Hola, Servidor");
		System.out.println("Respuesta del Servidor " + mensajeEntrada.readLine());

		mensajeEntrada.close();
		mensajeSalida.close();
		socket.close();
	}
}