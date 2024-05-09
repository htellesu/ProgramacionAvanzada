public interface Manejador{
	public void setManejador(Manejador siguiente); //envia un dato "siguiente"
	public void solPrestamo(int valor);
	public Manejador getManejador();
}