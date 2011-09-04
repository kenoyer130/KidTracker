package com.jkenoyer.kidtracker.model;

public class Merit  implements IMerit{
	private String desc;
	private int id;
	private double amount;
	
	public void setDesc(String desc) {
		this.desc = desc;		
	}

	public String getDesc() {
		return desc;
	}

	public void setID(int id) {	
		this.id = id;
	}

	public int getID() {		
		return id;
	}

	public void setAmount(double amount) {
		this.amount = amount;		
	}

	public double getAmount() {
		return amount;
	}
}
