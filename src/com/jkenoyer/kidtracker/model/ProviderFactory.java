package com.jkenoyer.kidtracker.model;

import android.content.Context;

public class ProviderFactory {
	
	public static IChildProvider getChildProvider(Context context){
		return new ChildProviderLocal(context);
	}	
}
