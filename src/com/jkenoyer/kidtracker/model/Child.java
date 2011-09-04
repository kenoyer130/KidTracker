package com.jkenoyer.kidtracker.model;

public class Child implements ICrud<Child> {
	private int id;
	private String name;
	private static IChildProvider childProvider;
	
	static{
		ProviderFactory.getChildProvider();	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int Create() {
		return childProvider.save(this);
	}

	public static Child Read(int id) {
		return childProvider.read(id);
	}

	public void Update(Child child) {
		childProvider.update(child);		
	}

	public void Delete(int id) {
		childProvider.delete(id);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
