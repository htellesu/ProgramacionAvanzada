public class HolaMundo{
	public static void main(String [] args){						Persona luis = new Persona();
		luis.caminar();	
		System.out.println(luis.getEdad());
		luis.setEdad(35);
		System.out.println(luis.getEdad());
	}
}
