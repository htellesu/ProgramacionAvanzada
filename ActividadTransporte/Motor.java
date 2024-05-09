public abstract class Motor{
	protected String tipo; //tipo de motor Electrico, combustion o hibrido
	protected int potencia; // potencia del motor

	Motor(String tipo, int potencia){
		this.tipo = tipo;
		this.potencia = potencia;
	}
	//constructores - abstracts
	public abstract void encender();
	public abstract void apagar();

	public String getTipo(){
		return tipo;
	}
	public int getPotencia(){
		return potencia;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
}