public class Persona{
	//metodos y clases public - atributos private
	private int edad;
	private String nombre;
	private char genero;
	private int estatura;
	public Persona(){
		edad = 8;
		nombre = "luis";
		genero = 'M';
		estatura = 168;
	}
	public void caminar(){
		System.out.println("ESTOY CAMINANDO");
	}
	public void setEdad(int recibe){
		edad = recibe;
	}
	public int getEdad(){
		return edad;
	}
}