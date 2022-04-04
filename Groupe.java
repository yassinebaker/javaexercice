package com.supinfo;

import java.time.LocalDate;

public class Groupe {
	private int id;
	private String nom;
	private LocalDate dateCreation;
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
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Groupe [id=" + id + ", nom=" + nom + ", dateCreation=" + dateCreation + "]";
	}
	public static void main(String[]args) {
		Groupe groupe= new Groupe();
		LocalDate dateCreation= LocalDate.parse("2000-05-25");
		groupe.setId(2)	;
		groupe.setNom("pr311");
		groupe.setDateCreation(dateCreation);
		
		
		}
	

}
