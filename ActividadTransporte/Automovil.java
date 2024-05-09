public class Automovil extends Terrestre{
	private Motor motor;

	Automovil(String fabricante, String modelo, boolean pasajeros, boolean mercancia, Motor motor){
		super(fabricante, modelo, pasajeros, mercancia);
		this.motor = motor;
	}

	public void recorrer(){
		System.out.println("El auto esta andando");
	}
	
	public void MediosDesplazamiento(){
		motor.encender();
		System.out.println("El auto se esta conduciendo");
		motor.apagar();
	}
}