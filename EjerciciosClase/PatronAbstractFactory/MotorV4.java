public class MotorV4 extends Motor{
	private int nCilindros;
	MotorV4(){
		nCilindros = 4;
		setCc(1200);
		setMarca("Hyundai");
		setPotencia(100);	
	}

	//métodos abstratos - se deben inicializar
	public void revolucionar(){
		System.out.println("El motor V4 esta revolucionado");
	}
	public void frenoMotor(){
		System.out.println("El motor V4 esta frenando el motor");
	}

}