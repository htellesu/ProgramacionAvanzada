import java.io.*;

public class Servidor extends Conexion{
	String mensaje;
	public Servidor() throws IOException{
		super("servidor");
	}
	public void iniciar(){
		try{
			System.out.println("Funciona, que alegria");
			socketCliente = socketServidor.accept();
			System.out.println("Se han conectado al servidor");
			mensajeAEnviar = new DataOutputStream(socketCliente.getOutputstream());								mensajeAEnviar.writeUTF("Hola");
			BufferedReader mensajeEntrante = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
			while((mensaje = mensajeEntrante.readLine()) != null){
				System.out.println(mensaje);
			}
			System.out.println("La comunicaicon ha acabado satisfactoriamente");
			socketServidor.close();
			
		}catch(Exception e){
			System.out.println("Se rompió todo, Recapacita");
		}
	}
}