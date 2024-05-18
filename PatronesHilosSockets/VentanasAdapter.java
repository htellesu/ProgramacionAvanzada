//Clase del patron adapter -- Adapta VentanasNuevas para que cumpla con la interfaz MaterialInterface
public class VentanasAdapter implements MaterialInterface{
	private VentanasNuevas ventanasNuevas;

	VentanasAdapter(VentanasNuevas ventanasNuevas){
		this.ventanasNuevas = ventanasNuevas;
	}

	public String getMaterial(){
		return ventanasNuevas.getMaterialDeVentana();
	}
}