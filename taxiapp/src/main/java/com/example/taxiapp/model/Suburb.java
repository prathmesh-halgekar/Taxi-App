package com.example.taxiapp.model;

public class Suburb extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Suburb(String name, String zone) {
		super();
		this.name = name;
		this.zone = zone;
	}
	private String name;
	private String zone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	

}
