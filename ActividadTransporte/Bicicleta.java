public class Bicicleta extends Terrestre{

	private Bicicleta(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		super(fabricante, modelo, pasajeros, mercancia);
	}

	public void recorrer(){
		System.out.println("la bicicleta esta en movimiento");
	}
	public void mediosDesplazamiento(){
		recorrer();
	}
}