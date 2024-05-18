public class Casa extends Construccion{
	private boolean tieneJardin;

	public void setTieneJardin(boolean tieneJardin){
		this.tieneJardin = tieneJardin;
	}		

	public void mostrarDetalles(){
		super.mostrarDetalles();
		//se usa operador ternario - da un valor de acuerdo a la entrada de tieneJardin
		System.out.println("Tiene Jardín " + (tieneJardin ? "Si":"No") );
	}
}