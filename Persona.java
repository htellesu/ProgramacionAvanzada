public class Persona extends SerVivo implements Trabajar{
	//metodos y clases public - atributos private
	private int salario;
	public Persona(int salario, char genero, String nombre, int edad){
		super(edad, genero, "Homo Sapiens Sapiens", nombre);
		this.salario = salario;
	}
	public void respirar(){
		System.out.println("Estoy respirando");
	}
	public void caminar(){
		System.out.println("ESTOY CAMINANDO");
	}
	public void caminar(int km){
		System.out.println("Hoy amaneci animado y camine " + km + " kilometros");
	}
	public void trabajar(){
		System.out.println("Estoy trabajando");
	};
	public int descansar(){
		return 1;
	};
}