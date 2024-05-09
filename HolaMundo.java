public class HolaMundo{
	public static void main(String [] args){
	//Crea nuevos objetos										
		Persona luis = new Persona(20000000, 'M', "luis", 30);
		Pez nemo = new Pez();
	//Trabaja con los metodos
		luis.caminar();
		luis.caminar(30);
		luis.respirar();
		luis.reproduccion();
		nemo.respirar();
		nemo.reproduccion();
	//Visualiza mensajes
		System.out.println(luis.getEdad());
		System.out.println(luis.getEspecie());
	}
}
