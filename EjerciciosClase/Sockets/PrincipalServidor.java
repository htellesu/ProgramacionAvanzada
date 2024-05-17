import java.io.*;

public class PrincipalServidor{
	public static void main(String [] args) throws IOException{
		Servidor universidad = new Servidor();
		universidad.iniciarServidor();
	}
}