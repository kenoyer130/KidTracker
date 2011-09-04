package com.jkenoyer.kidtracker.model;

import android.database.sqlite.SQLiteDatabase;

public class ChildProviderLocal implements IChildProvider {
	
	private SQLiteDatabase db = new DBHelper.getDb()
	
	public int save(Child child) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(Child child) {
		// TODO Auto-generated method stub
		
	}

	public Child read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
