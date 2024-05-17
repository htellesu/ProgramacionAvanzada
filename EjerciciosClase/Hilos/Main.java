public class Main {

    public static void main(String[] args) {
        Hilo1 tarea1 = new Hilo1();
        Hilo2 tarea2 = new Hilo2();
        AudioClip audio = new AudioClip();
        Thread t1 = new Thread(tarea1);
        Thread t2 = new Thread(tarea2);
        Thread t3 = new Thread(audio);
        t1.start();
        t2.start();
        t3.start();
    }
}