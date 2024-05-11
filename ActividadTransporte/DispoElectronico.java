public abstract class DispoElectronico{
	protected String marca;
	protected String tipo;
	protected String memoria;
	
	DispoElectronico(String marca, String tipo, String memoria){
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	
	public abstract void encendido();
	public abstract void conectado();

	public String getMarca(){
		return marca;
	}
	public String getTipo(){
		return tipo;
	}
	public String getMemoria(){
		return memoria;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setMemoria(String memoria){
		this.memoria = memoria;
	}

}