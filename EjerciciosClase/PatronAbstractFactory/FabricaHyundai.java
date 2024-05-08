public class FabricaHyundai extends FabricaCarros{
	public Motor crearMotor(){
		return new MotorV4();
	}
	public Carro crearCarro(Motor motor){
		return new Hyundai(motor);
	}

}