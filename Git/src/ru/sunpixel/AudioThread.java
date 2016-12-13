package ru.sunpixel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

public class AudioThread implements Runnable {

	@Override
	public void run() {
		
		try {
			javazoom.jl.player.Player p = new javazoom.jl.player.Player(new FileInputStream("res/sound.mp3"));
			p.play();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
