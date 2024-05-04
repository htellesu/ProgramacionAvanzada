public class HolaMundo{
	public static void main(String [] args){										Persona luis = new Persona(20000000, 'M', "luis", 30);
		luis.caminar();
		luis.caminar(30);
		luis.respirar();
		System.out.println(luis.getEdad());
		System.out.println(luis.getEspecie());
	}
}
