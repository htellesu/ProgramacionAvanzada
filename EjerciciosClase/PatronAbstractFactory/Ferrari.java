public class Ferrari extends Carro{

	//método contructor
	Ferrari(Motor motor){
		super(motor);
		System.out.println("El carro Ferrari se ensamblo correctamente con el motor");
	}
	public void acelerar(){
		System.out.println("El auto Ferrari se esta acelerando");
		getMotor().revolucionar(); 
	}
}