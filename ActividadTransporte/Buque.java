public class Buque extends Maritimo{

	Buque(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		super(fabricante, modelo, pasajeros, mercancia);
	}

	public void navegar(){
		System.out.println("el buque esta navegando");
	}
	public void MediosDesplazamiento(){
		navegar();
	}
}