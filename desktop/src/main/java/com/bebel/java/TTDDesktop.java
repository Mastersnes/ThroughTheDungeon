package com.bebel.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bebel.core.TTD;

public class TTDDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Test";
		config.width = 1024;
		config.height = 768;
		config.backgroundFPS = 60;
		config.foregroundFPS = 60;
		new LwjglApplication(new TTD(), config);
	}
}
