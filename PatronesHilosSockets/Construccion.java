//Clase base para representar construcciones con detalles comunes como paredes, ventanas, puertas, techo, habitaciones y toilets.
public abstract class Construccion{
	protected String paredes;
	protected MaterialInterface ventanas;
	protected String puertas;
	protected String techo;
	protected int habitaciones;
	protected int toilets;

	//Dependen de lo que ingresen
	public void setParedes(String paredes){
		this.paredes = paredes;
	}
	public void setVentanas(MaterialInterface ventanas){
		this.ventanas = ventanas;
	}
	public void setPuertas(String puertas){
		this.puertas = puertas;
	}
	public void setTecho(String techo){
		this.techo = techo;
	}
	public void setHabitaciones(int habitaciones){
		this.habitaciones = habitaciones;
	}
	public void setToilets(int toilets){
		this.toilets = toilets;
	}
	
	//Generalidades entre casa y apartamento
	public void mostrarDetalles(){
		System.out.println("Material Paredes: " + paredes);
		System.out.println("# Ventanas: " + ventanas.getMaterial());
		System.out.println("# Puertas: " + puertas);
		System.out.println("Tipo Techo: " + techo);
		System.out.println("# Habitaciones: "+ habitaciones);
		System.out.println("# Toliets: " + toilets);
	}
}