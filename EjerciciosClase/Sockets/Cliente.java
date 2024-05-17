import java.io.*;
import java.util.Scanner;

public class Cliente extends Conexion{
	public Cliente()throws IOException{
		super("cliente");
	}
	public void iniciarCliente(){
		Scanner s = new Scanner(System.in);
		String mensaje;
		try{
			mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
			mensaje = s.nextLine();
			while(!mensaje.equals("termine")){
				mensajeAEnviar.writeUTF("Ingrese el nuevo valor a enviar");
				mensaje = s.nextLine();
			}
			System.out.println("Sali del cliente");
		}catch(Exception e){
			
		}
	}	
}