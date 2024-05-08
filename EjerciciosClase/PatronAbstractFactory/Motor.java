public abstract class Motor{
	private int cc;
	private String marca;
	private int potencia;
	public abstract void revolucionar();
	public abstract void frenoMotor();

	//metodo constructor
	public void setCc(int cc){
		this.cc = cc;
	}
	public void setMarca(String Marca){
		this.marca = marca;
	}
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
}