public class Principal{
	public static void main(String [] args){
		Motor motorElectrico = new MotorElectrico(150,200);
		Automovil tesla = new Automovil("Tesla", "Model x", true, false, motorElectrico);
		tesla.MediosDesplazamiento();
		
		Avion boeing = new Avion("Boeing", "747", true, true);
		boeing.MediosDesplazamiento();

		Buque enterprise = new Buque("Newport News Shipbuilding", "Enterprise", true, true);
		enterprise.MediosDesplazamiento();
	}
}