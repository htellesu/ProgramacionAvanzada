public class Principal{
	public static void main(String [] args){
		Motor motorElectrico = new MotorElectrico(150,200);
		DispoElectronico dispoElectronico = new Tv("LG", 42.0f, "4K", 1024 );
		Automovil tesla = new Automovil("Tesla", "Model x", true, false, motorElectrico, dispoElectronico);
		tesla.mediosDesplazamiento();
		
		DispoElectronico dispoElectronico1 = new Computador("HP", 12.0f, "720K", "WI-FI");
		Avion boeing = new Avion("Boeing", "747", true, true, dispoElectronico1);
		boeing.mediosDesplazamiento();

		Buque enterprise = new Buque("Newport News Shipbuilding", "Enterprise", true, true);
		enterprise.mediosDesplazamiento();
	}
}