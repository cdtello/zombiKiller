package hilo;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import interfaz.InterfazZombieKiller;

public class HiloSonido extends Thread {

	private String ruta;
	private Clip sonido;

	public HiloSonido(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public void run() {		
		try {
      BufferedInputStream bufInS = new BufferedInputStream(
				getClass().getResourceAsStream("/sonidos/" + ruta + ".wav"));
      System.out.print("****** ERROR 1--->");
      AudioInputStream audTest = AudioSystem.getAudioInputStream(bufInS);
      System.out.print("****** ERROR 2--->");
			AudioInputStream audInS = audTest;
      System.out.print("****** ERROR 3--->");
			sonido = AudioSystem.getClip();
			sonido.open(audInS);
			sonido.start();
			sleep(3000);
			if (ruta.equals("zombies")) {
				while (sonido.isRunning())
					sleep(500);
				if (sonido.isOpen())
					run();
			} else if (ruta.equals("sirena"))
				while (sonido.isRunning())
					sleep(500);
			sonido.close();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
      System.out.print("****** ERROR --->" + e);
			e.printStackTrace();
		}
	}

	public void detenerSonido() {
    System.out.println("Sonido -->"+ sonido);
		if (sonido!= null){
      sonido.close();
    }
		
	}
}
