public class Aceite{
	private String tipo; //sintetico, semi - sintetico - mineral
	private String marca; //mobil, honda, motul entre otros
	private double cantidad; 

	public Aceite(String tipo, String marca, double cantidad){
		this.tipo = tipo;
		this.marca = marca;
		this.cantidad = cantidad;	
	}

	//contructores
	public String getTipo(){
		return tipo;
	}
	public String getMarca(){
		return marca;
	}
	public double getCantidad(){
		return cantidad;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setCantidad(double cantidad){
		this.cantidad = cantidad;
	}
}