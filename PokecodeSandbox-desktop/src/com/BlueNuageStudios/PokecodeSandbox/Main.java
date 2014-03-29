package com.BlueNuageStudios.PokecodeSandbox;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "PokéCode Sandbox";
		cfg.useGL20 = true;
		cfg.width = 1088;
		cfg.height = 704;
		cfg.resizable = false;
		
		new LwjglApplication(new MainClass(), cfg);
	}
}
