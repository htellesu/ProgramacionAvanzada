// Inicializa y ejecuta tres hilos independientes que gestionan la construcción, el chat y la reproducción de audio.

public class Main{
	public static void main(String[] args){
		ConstruccionManager construccionManager = new ConstruccionManager();
		ChatManager chatManager = new ChatManager();
		AudioClip audio = new AudioClip();

		Thread t1 = new Thread(construccionManager);
		Thread t2 = new Thread(chatManager);
		Thread t3 = new Thread(audio);

		t1.start();
		t2.start();
		t3.start();
	}
}