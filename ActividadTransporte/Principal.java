public class Principal{
	public static void main(String [] args){
		Motor motorElectrico = new MotorElectrico(150,200);
		Aceite aceite = new Aceite("Sintetico", "Mobil", 5.0);
		DispoElectronico dispoElectronico = new Tv("LG", 42.0f, "4K", 1024 );
		Automovil tesla = new Automovil("Tesla", "Model x", true, false, motorElectrico, dispoElectronico, 		aceite);
		tesla.mediosDesplazamiento();
		System.out.println("\n");
		
		DispoElectronico dispoElectronico1 = new Computador("HP", 12.0f, "720K", "WI-FI");
		Avion boeing = new Avion("Boeing", "747", true, true, dispoElectronico1);
		boeing.mediosDesplazamiento();
		System.out.println("\n");

		Buque enterprise = new Buque("Newport News Shipbuilding", "Enterprise", true, true);
		enterprise.mediosDesplazamiento();
		System.out.println("\n");

		Motor motorCombustion = new MotorCombustion(1600, 15, 1.0);
		Aceite aceite2 = new Aceite ("Semi-Sintetico", "Honda", 4.0);
		DispoElectronico computador = new Computador("Lenovo", 9.0f, "1040", "Wi-Fi");
		Automovil chevrolet = new Automovil("Chevrolet", "Sail", true, false, motorCombustion, computador, 		aceite2);
		chevrolet.mediosDesplazamiento();
	}
}