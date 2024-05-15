public class Tv extends DispoElectronico{
	private float tamaño;
	private String calidadImagen;

	Tv(String marca, float tamaño, String calidadImagen, int almacenamiento){
		super(marca, "Digital", "1 Gb");
		this.tamaño = tamaño;
		this.calidadImagen = calidadImagen; 
	}	

	public float getTamaño(){
		return tamaño;
	}
	public void setTamaño(float tamaño){
		this.tamaño = tamaño;
	}

	public String getCalidadImagen(){
		return calidadImagen;
	}
	public void setCalidadImagen(String calidadImagen){
		this.calidadImagen = calidadImagen;
	}
}
