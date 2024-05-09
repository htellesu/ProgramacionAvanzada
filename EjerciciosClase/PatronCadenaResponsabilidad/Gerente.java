public class Gerente implements Manejador{
	private Manejador siguienteNivel;

	public void setManejador(Manejador siguiente){
		this.siguienteNivel = siguiente;
	}
	public void solPrestamo(int valor){
		if(valor >= 15000000 && valor < 1000000000){
			System.out.println("El préstamo lo gestiona el gerente de la entidad");
		} else{
			System.out.println("Lo sentimos mucho, no podemos atender a tu solicitud");
		}
	}
	public Manejador getManejador(){
		return siguienteNivel;
	}
}