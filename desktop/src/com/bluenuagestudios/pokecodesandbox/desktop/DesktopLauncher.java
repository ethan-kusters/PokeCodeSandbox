package com.bluenuagestudios.pokecodesandbox.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bluenuagestudios.pokecodesandbox.MainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "PokéCode Sandbox";
		cfg.width = 1088;
		cfg.height = 704;
		cfg.resizable = false;
		
		new LwjglApplication(new MainClass(), cfg);
	}
}
