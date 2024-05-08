public class FabricaFerrari extends FabricaCarros{
	public Motor crearMotor(){
		return new MotorV8();
	}
	public Carro crearCarro(Motor motor){
		return new Ferrari(motor);
	}

}