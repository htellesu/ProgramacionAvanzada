public abstract class Carro{
	private Motor motor;
	Carro(Motor motor){
		this.motor = motor;
	}
	public abstract void acelerar();
	
	public Motor getMotor(){
		return motor;
	}
}