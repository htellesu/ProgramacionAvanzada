import java.util.Scanner;

public class Cliente{
	public static void main(String [] args){

		Carro zoomzoom;
		Vendedor pedro = new Vendedor();

		Scanner lectura = new Scanner(System.in);
		System.out.println("Marque 1 para comprar un auto Ferrari. 2 para un auto Hyundai");
		int resultado = lectura.nextInt();

		if (resultado == 1){
			zoomzoom = pedro.comprarCarro(new FabricaFerrari());
		}else{
			zoomzoom = pedro.comprarCarro(new FabricaHyundai());
		}
		zoomzoom.acelerar();
	}
}