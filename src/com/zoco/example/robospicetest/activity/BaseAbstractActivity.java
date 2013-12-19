package com.zoco.example.robospicetest.activity;

import android.app.Activity;

import com.octo.android.robospice.SpiceManager;
import com.zoco.example.robospicetest.http.ZocoClientService;

/**
 * This class serves as a template for all the activities in this project, links
 * the class {@link SpiceManager} and implements the methods for start, stop and
 * return it.
 * */
public class BaseAbstractActivity extends Activity {

	SpiceManager spcMngr = new SpiceManager(ZocoClientService.class);

	@Override
	protected void onStart() {
		super.onStart();
		spcMngr.start(this);
	}

	@Override
	protected void onStop() {
		spcMngr.shouldStop();
		super.onStop();
	}

	public SpiceManager getSpiceManager() {
		return this.spcMngr;
	}
}
