public class Avion extends Aereo implements Interfaz{
	private DispoElectronico dispoElectronico;
	
	Avion(String fabricante, String modelo, boolean pasajeros, boolean mercancia, DispoElectronico dispoElectronico){
	super(fabricante, modelo, pasajeros, mercancia);
		this.dispoElectronico = dispoElectronico;
	}

	public void volar(){
		System.out.println("El avión esta volando");
	}
	public void recorrer(){
	}	
	public void navegar(){
	}
	public void mediosDesplazamiento(){
		volar();
		dispoElectronico.encendido();
		dispoElectronico.conectado();
	}
}
