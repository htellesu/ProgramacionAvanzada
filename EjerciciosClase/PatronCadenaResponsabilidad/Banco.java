public class Banco implements Manejador{
	private Manejador siguienteNivel;

	public void setManejador(Manejador siguiente){
		this.siguienteNivel = siguiente;
	}
	public void solPrestamo(int valor){
		Pagina Bancolombia = new Pagina();
		Asesor pedro = new Asesor();
		Gerente luisa = new Gerente();
		this.siguienteNivel = Bancolombia;
		Bancolombia.setManejador(pedro);
		pedro.setManejador(luisa);
		siguienteNivel.solPrestamo(valor);
		 
	}
	public Manejador getManejador(){
		return siguienteNivel;
	}
}