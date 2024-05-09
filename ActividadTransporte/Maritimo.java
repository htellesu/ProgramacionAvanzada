public abstract class Maritimo extends MediosTransporte implements Navegar{
	public Maritimo(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		super(fabricante, modelo, pasajeros, mercancia);
	}
}