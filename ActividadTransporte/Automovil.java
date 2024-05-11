public class Automovil extends Terrestre{
	private Motor motor;
	private DispoElectronico dispoElectronico;

	Automovil(String fabricante, String modelo, boolean pasajeros, boolean mercancia, Motor motor, DispoElectronico dispoElectronico){
		super(fabricante, modelo, pasajeros, mercancia);
		this.motor = motor;
		this.dispoElectronico = dispoElectronico;
	}

	public void recorrer(){
		System.out.println("El auto esta andando");
	}
	
	public void mediosDesplazamiento(){
		motor.encender();
		System.out.println("El auto se esta conduciendo");
		dispoElectronico.encendido();
		motor.apagar();
	}
	public void encendido(){
		System.out.println("El TV esta encendido..!");
	}
	
}