package com.jkenoyer.kidtracker.activity;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {
	
	private static Activity appContext;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	public static Activity getAppContext() {
		return appContext;
	}

	public static void setAppContext(Activity context) {
		appContext = context;
	}
}
