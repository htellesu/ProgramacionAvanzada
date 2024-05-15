public class Buque extends Maritimo implements Interfaz{

	Buque(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		super(fabricante, modelo, pasajeros, mercancia);
	}

	public void navegar(){
		System.out.println("el buque esta navegando");
	}
	public void volar(){}
	public void recorrer(){}

	public void mediosDesplazamiento(){
		navegar();
	}
}