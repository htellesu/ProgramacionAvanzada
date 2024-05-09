public abstract class MotorHibrido extends Motor implements CambioAceite{
	private int capBateria;
	private String combustible;
	private double nivelAceite;

	public MotorHibrido(int potencia, int capBateria, String combustible, double nivelAceite){
		super("Hibrido", potencia);
		this.capBateria = capBateria;
		this.combustible = combustible;
		this.nivelAceite = nivelAceite;
	}
	
	//metodos - inicializacion del abstract
	public void encender(){
		System.out.println("Motor Hibrido Encendido, combustible " + combustible + " galones, y carga de 					bateria de " + capBateria + "KWh");
	}
	public void apagar(){
		System.out.println("Motor Hibrido apagado.");
	}

	public void CambiarAceite(){
		System.out.println("Cambiando aceite del motor");
		nivelAceite = 100.0; //porcentaje de aceite
	}
	public void verificarNivelAceite(){
		System.out.println("Nivel de aceite "+nivelAceite+" %.");
	}	
	
	public int getCapBateria(){
		return capBateria;
	}
	public String getCombustible(){
		return combustible;
	}
	public double getNivelAceite(){
		return nivelAceite;
	}
	public void setNivelAceite(double nivelAceite){
		this.nivelAceite = nivelAceite;
	}


	public void setCapBateria(int capBateria){
		this.capBateria = capBateria;
	}
	public void setCombustible(String combustible){
		this.combustible = combustible;
	}
}