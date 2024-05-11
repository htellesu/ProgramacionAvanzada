public class Computador extends DispoElectronico{
	private String conectividad;
	private String tipoVideo;

	Computador(String marca, float tamaño, String tipoVideo, String conectividad){
		super(marca, "inalambrica", "4K");
		this.tipoVideo = tipoVideo;
		this.conectividad = conectividad; 
	}
	
	public void encendido(){
		System.out.println("El computador esta encendido...…….!");
	}
	public void conectado(){
		System.out.println("El computador esta conectado...…….!");
	}	

	public String getConectividad(){
		return conectividad;
	}
	public void setTamaño(String conectividad){
		this.conectividad = conectividad;
	}

	public String getTipoVideo(){
		return tipoVideo;
	}
	public void setTipoVideo(String tipoVideo){
		this.tipoVideo = tipoVideo;
	}
}