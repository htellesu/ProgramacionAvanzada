public class Hyundai extends Carro{

	//método contructor
	Hyundai(Motor motor){
		super(motor);
		System.out.println("El carro Hyundai se ensamblo correctamente con el motor");
	}
	public void acelerar(){
		System.out.println("El auto Hyundai se esta acelerando");
		getMotor().revolucionar();
	}
	
}