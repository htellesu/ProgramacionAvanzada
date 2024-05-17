public class Main{
	public static void main(String[] args){
		ChatManager chatManager = new ChatManager();
		AudioClip audio = new AudioClip();
		Thread t2 = new Thread(chatManager);
		Thread t3 = new Thread(audio);
		t2.start();
		t3.start();
	}
}