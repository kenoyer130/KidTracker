package com.jkenoyer.kidtracker.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

	private SQLiteDatabase db;
	private static final int DATABASE_VERSION = 1;
	private static final String DB_NAME = "sample.db";
    private static final String Child_NAME = "child";
	
	 /**
     * Constructor
     * @param context the application context
     */
    public DBHelper(Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(
                "create table " + Child_NAME + " (id integer primary key autoincrement," + "name text not null) ");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
	}

	public SQLiteDatabase getDb() {
		return db;
	}
}
