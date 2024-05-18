//Clase builder para construir instancias de Casa o Apartamento con varios atributos.
public class ConstruccionBuilder{
	private Construccion construccion;
	
	ConstruccionBuilder(String tipo){
		if(tipo.equalsIgnoreCase("casa")){
			construccion = new Casa();
		}else if(tipo.equalsIgnoreCase("apartamento")){
			construccion = new Apartamento();
		}
	}

	//Generalidades de contruccion

	public void setParedes(String paredes){
		construccion.setParedes(paredes);
	}
	public void setVentanas(MaterialInterface ventanas){
		construccion.setVentanas(ventanas);
	}
	public void setPuertas(String puertas){
		construccion.setPuertas(puertas);
	}
	public void setTecho(String techo){
		construccion.setTecho(techo);
	}
	public void setHabitaciones(int habitaciones){
		construccion.setHabitaciones(habitaciones);
	}
	public void setToilets(int toilets){
		construccion.setToilets(toilets);
	}

	//Metodos de casa
	public void setJardin(boolean tieneJardin){
		if(construccion instanceof Casa){
			((Casa) construccion).setTieneJardin(tieneJardin);
		}
	}
	//instancia y método de apartamento
	public void setNumeroPiso(int numeroPiso){
		if(construccion instanceof Apartamento){
			((Apartamento) construccion).setNumeroPiso(numeroPiso);
		}
	}
	public Construccion getConstruccion(){
		return construccion;
	}

}