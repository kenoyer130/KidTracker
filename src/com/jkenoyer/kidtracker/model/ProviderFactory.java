package com.jkenoyer.kidtracker.model;

public class ProviderFactory {
	
	public static IChildProvider getChildProvider(){
		return new LocalChildProvider();
	}	
}
