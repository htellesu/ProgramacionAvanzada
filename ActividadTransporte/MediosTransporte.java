public abstract class MediosTransporte{
	protected String fabricante;
	protected String modelo;
	protected boolean pasajeros;
	protected boolean mercancia;

	MediosTransporte(String fabricante, String modelo, boolean pasajeros, boolean mercancia){
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.pasajeros = pasajeros;
		this.mercancia = mercancia;
	}
	
	//constructores - atributos
	public String getFabricante(){
		return fabricante;
	}
	public String getModelo(){
		return modelo;
	}
	public boolean getPasajeros(){
		return pasajeros;
	}
	public boolean getMercancia(){
		return mercancia;
	}	
	//metodos abstractos - metodo general
	public abstract void mediosDesplazamiento();  //metodo del medio de desplazamiento
	public void movimiento(){
		System.out.println("Nos estamos desplazando........!");
	}
}