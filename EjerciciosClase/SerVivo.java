public abstract class SerVivo{
	private int edad;
	private char genero;
	private String nombre;
	private String especie;
	SerVivo(){
	
	}
	SerVivo(int edad, char genero, String especie, String nombre){
		this.edad = edad;
		this.genero = genero;
		this.especie = especie;
		this.nombre = nombre;
	}
	public void reproduccion(){
		System.out.println("Los seres vivos se estan reproduciendo");
	}
	public abstract void respirar();
	
	public int getEdad(){
		return edad;
	}
	public char getGenero(){
		return genero;
	}
	public String getEspecie(){
		return especie;
	}
	public String getNombre(){
		return nombre;
	}	
}