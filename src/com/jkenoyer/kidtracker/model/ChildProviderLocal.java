package com.jkenoyer.kidtracker.model;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.jkenoyer.kidtracker.model.DBHelper;

public class ChildProviderLocal implements IChildProvider {

	private SQLiteDatabase db;
	private static final String TABLE_NAME = "Child";

	public ChildProviderLocal(Context context) {
		db = new DBHelper(context).getDb();
	}

	public int save(Child child) {

		ContentValues values = new ContentValues();
		values.put("name", child.getName());

		return (int) db.insert("child", null, values);
	}

	public void update(Child child) {
		// TODO Auto-generated method stub

	}

	public Child read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Child> readAll() {
		ArrayList<Child> list = new ArrayList<Child>();
		Cursor cursor = this.db
				.query(TABLE_NAME, new String[] { "name", "name" }, null, null,
						null, null, "name");
		if (cursor.moveToFirst()) {
			do {
				Child c = new Child();
				c.setId(Integer.parseInt(cursor.getString(0)));
				c.setName(cursor.getString(1));
				list.add(c);
			} while (cursor.moveToNext());
		}
		if (cursor != null && !cursor.isClosed()) {
			cursor.close();
		}
		return list;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
