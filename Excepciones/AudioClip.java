import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;

public class AudioClip implements Runnable {

    @Override
    public void run() {
        try {
            playAudio("Reggae.wav");
        } catch (AudioFileNotFoundException | UnsupportedAudioFormatException | AudioPlaybackException e) {
            System.out.println("Error de audio personalizado: " + e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Error del sistema: Archivo de audio no encontrado.");
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Error del sistema: Formato de archivo de audio no soportado.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Error del sistema: Línea de audio no disponible.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error del sistema: Problema de entrada/salida.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Error del sistema: Hilo interrumpido.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void playAudio(String filePath) throws AudioFileNotFoundException, UnsupportedAudioFormatException, AudioPlaybackException, 
            FileNotFoundException, UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        try {
            // Intentar abrir el archivo de audio
            InputStream inputStream = new BufferedInputStream(new FileInputStream(filePath));
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, audioFormat);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Intentar abrir y reproducir el clip de audio
            clip.open(audioInputStream);
            clip.start();

            // Añadir un LineListener para cerrar el clip cuando termine de reproducirse
            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                }
            });

            // Esperar mientras el clip se está reproduciendo
            while (!clip.isRunning()) Thread.sleep(10);
            while (clip.isRunning()) Thread.sleep(10);

        } catch (FileNotFoundException e) {
            throw new AudioFileNotFoundException("El archivo de audio no se encontró: " + filePath);
        } catch (UnsupportedAudioFileException e) {
            throw new UnsupportedAudioFormatException("El formato de archivo de audio no es compatible: " + filePath);
        } catch (LineUnavailableException | IOException | InterruptedException e) {
            throw new AudioPlaybackException("Error durante la reproducción de audio: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Crear un nuevo hilo para reproducir el audio
        Thread audioThread = new Thread(new AudioClip());
        audioThread.start();
    }
}
