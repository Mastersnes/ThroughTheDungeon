package com.bebel.html;

import com.bebel.core.TTD;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class TTDHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new TTD();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
