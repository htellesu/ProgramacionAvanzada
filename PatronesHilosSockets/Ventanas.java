//esta Clase cuenta con una interfaz para poder gersionar y trabajar con el patron adapter relacion Ventanas -- VentanasNuevas
public class Ventanas implements MaterialInterface{
	private String material;

	Ventanas(String material){
		this.material = material;
	}
	
	public String getMaterial(){
		return material;
	}
}