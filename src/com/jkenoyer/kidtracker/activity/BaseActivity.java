package com.jkenoyer.kidtracker.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseActivity extends Activity {

	private static Activity appContext;
	private static boolean firstRun = true;

	public BaseActivity() {
		if (firstRun) {
			addGlobalErrorHandler();
			firstRun = false;
		}
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected abstract void init();

	public static Activity getAppContext() {
		return appContext;
	}

	public static void setAppContext(Activity context) {
		appContext = context;
	}

	private void addGlobalErrorHandler() {
		Thread.currentThread().setUncaughtExceptionHandler(
				new Thread.UncaughtExceptionHandler() {
					public void uncaughtException(Thread thread, Throwable ex) {
						Log.v("error", ex.getMessage() + " stack : "
								+ ex.getStackTrace().toString());
					}
				});
	}
}
