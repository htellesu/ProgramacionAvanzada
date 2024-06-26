public class MotorCombustion extends Motor implements CambioAceite{
	private int combustible; 
	private double nivelAceite;

	MotorCombustion(int potencia, int combustible, double nivelAceite){
		super("Combustion", potencia);
		this.combustible = combustible;
		this.nivelAceite = nivelAceite;
	}
	
	//metodos - inicializacion del abstract
	public void encender(){
		System.out.println("Motor de Combustion Encendido, nivel " + combustible + " galones.");
	}
	public void apagar(){
		System.out.println("Motor de combustion apagado.");
	}

	public void cambiarAceite(){
		System.out.println("Cambiando aceite del motor");
		nivelAceite = 100.0; //porcentaje de aceite
	}
	public void verificarNivelAceite(){
		System.out.println("Nivel de aceite "+nivelAceite+" %.");
	}	

	public int getCombustible(){
		return combustible;
	}
	public void setCombustible(int combustible){
		this.combustible = combustible;
	}
	public double getNivelAceite(){
		return nivelAceite;
	}
	public void setNivelAceite(double nivelAceite){
		this.nivelAceite = nivelAceite;
	}
}	