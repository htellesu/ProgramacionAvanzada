import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AuidoClip implements runnable{
	@override
	public void run(){
		try{
			InputStream inputStream = new BufferedInputStream(new FileInputStream("remix.wav"));
			AudioInputStream audioInputStream = AdioSystem.getAudioInputStream(inputStream);
			AudioFormat audioFormat = audioInputStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, audioFormat);
			Clip clip = (Clip) AudioSystem.getLine(info);
			clip.open(audioInputStream);
			clip.start();
		}catch(Exception e){
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
			AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileType();
			System.out.println("Formatos soportados: ");
			for(AudioFileFormat.Type tipo : tipos){
				System.out.print(tipo.getExtension() + ", ");
			}
			System.out.println("");
		}
	}
}