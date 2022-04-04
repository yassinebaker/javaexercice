package com.supinfo;

import java.time.LocalDate;

public class Salle {
	private int id;
	private String nom;
	private String localisation;
	private int capacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Salle [id=" + id + ", nom=" + nom + ", localisation=" + localisation + ", capacity=" + capacity + "]";
	}
	public static void main(String[]args) {
		Salle salle1= new Salle();
		salle1.setId(2);
		salle1.setNom("centrino");
		salle1.setLocalisation("Dakar");
		salle1.setCapacity(30);
		
	}
}	
		

