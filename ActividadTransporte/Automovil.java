public class Automovil extends Terrestre implements Interfaz, CambioAceite{
	private Motor motor;
	private DispoElectronico dispoElectronico;
	private Aceite aceite;

	Automovil(String fabricante, String modelo, boolean pasajeros, boolean mercancia, Motor motor, DispoElectronico dispoElectronico, Aceite aceite){
		super(fabricante, modelo, pasajeros, mercancia);
		this.motor = motor;
		this.dispoElectronico = dispoElectronico;
		this.aceite = aceite;
	}

	public void recorrer(){
		System.out.println("El auto esta andando");
	}
	public void navegar(){}
	public void volar(){}

	public void cambiarAceite() {
        	System.out.println("Cambiando aceite a tipo: " + aceite.getTipo() + ", marca: " + aceite.getMarca() + ", cantidad: " + aceite.getCantidad() + " litros");
    	}
	public void verificarNivelAceite(){
		System.out.println("Verificando el nivel del aceite");
	}	

	
	public void mediosDesplazamiento(){
		motor.encender();
		cambiarAceite();
		verificarNivelAceite();
		recorrer();
		dispoElectronico.encendido();
		motor.apagar();
		dispoElectronico.apagado();
	}
}	