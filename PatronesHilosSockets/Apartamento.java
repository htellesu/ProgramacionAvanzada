public class Apartamento extends Construccion{
	private int numeroPiso;

	public void setNumeroPiso(int numeroPiso){
		this.numeroPiso = numeroPiso;
	}	

	public void mostrarDetalles(){
		super.mostrarDetalles();
		System.out.println("Numero del Piso es: " + numeroPiso);
	}
}