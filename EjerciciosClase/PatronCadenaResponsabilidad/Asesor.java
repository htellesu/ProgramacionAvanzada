public class Asesor implements Manejador{
	private Manejador siguienteNivel;

	public void setManejador(Manejador siguiente){
		this.siguienteNivel = siguiente;
	}
	public void solPrestamo(int valor){
		if(valor >= 5000000 && valor <= 15000000){
			System.out.println("El préstamo lo gestiona el asesor de la entidad");
		} else{
			siguienteNivel.solPrestamo(valor);
		}
	}
	public Manejador getManejador(){
		return siguienteNivel;
	}
}