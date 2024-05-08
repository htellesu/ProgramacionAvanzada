public class MotorV8 extends Motor{
	private int nCilindros;
	MotorV8(){
		nCilindros = 8;
		setCc(1600);
		setMarca("Ford");
		setPotencia(500);	
	}
//métodos abstratos - se deben inicializar
	public void revolucionar(){
		System.out.println("El motor V8 esta revolucionado");
	}
	public void frenoMotor(){
		System.out.println("El motor V8 esta frenando el motor");
	}

}