package com.supinfo;

import java.time.LocalDate;

public class Niveau 
{
	private String id;
	private String designation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Niveau [id=" + id + ", designation=" + designation + "]";
	}
	public static void main(String[]args) {
		Niveau niveau= new Niveau();
		niveau.setId("1");
		niveau.setDesignation("dfhkglhkm" );
	
	}

}
