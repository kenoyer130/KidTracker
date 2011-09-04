package com.jkenoyer.kidtracker.model;

public interface IChildProvider {
	public int save(Child child);
	public void update(Child child);
	public Child read(int id);
	public void delete(int id);
}
