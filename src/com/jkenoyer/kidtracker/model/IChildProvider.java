package com.jkenoyer.kidtracker.model;

import java.util.ArrayList;

public interface IChildProvider {
	public int save(Child child);
	public void update(Child child);
	public Child read(int id);
	public ArrayList<Child> readAll();
	public void delete(int id);
}
