package com.onomos.vrau.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.onomos.vrau.OnomosWhoosh;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "OnomosWhoosh";
		config.width = 640;
		config.height = 350;
		new LwjglApplication(new OnomosWhoosh(), config);
	}
}
