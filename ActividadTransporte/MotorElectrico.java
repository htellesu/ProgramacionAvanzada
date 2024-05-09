public class MotorElectrico extends Motor{
	private int capBateria; //en KWh

	//herencia
	public MotorElectrico(int potencia, int capBateria){
		super("Electrico", potencia);
		this.capBateria = capBateria;
	}
	//metodos - inicializacion del abstract
	public void encender(){
		System.out.println("Motor electrico encendido. Bateria al " + capBateria + " KWh.");
	}
	public void apagar(){
		System.out.println("Motor electrico apagado.");
	}

	public int getCapBateria(){
		return capBateria;
	}
	public void setCapBateria(){
		this.capBateria = capBateria;
	}
}
