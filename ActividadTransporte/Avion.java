public class Avion extends Aereo{
	Avion(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
	super(fabricante, modelo, pasajeros, mercancia);
	}

	public void volar(){
		System.out.println("El avión esta volando");
	}
	
	public void MediosDesplazamiento(){
		volar();
	}
}
