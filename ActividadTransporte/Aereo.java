public abstract class Aereo extends MediosTransporte implements Interfaz{
	public Aereo(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		super(fabricante, modelo, pasajeros, mercancia);
	}
}