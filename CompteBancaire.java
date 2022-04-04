package com.supinfo;

public abstract class CompteBancaire 
{
	private int id;
	private String prenom;
	private String nom;
	private int numero;
	private float solde;

	//constructeur explicite sans paramétres
	public  CompteBancaire () {
		System.out.println("creation d'un compte");
	}
	public CompteBancaire (int id,String prenom,String nom, int numero,
			float solde) 
	{
		this.id =id;
		this.prenom=prenom;
		this.nom=nom;
		this.numero =numero;
		this.solde = solde;
		
	}
	 public void debiter(float montant) {
		 solde = solde+montant;
	 }
	 public void crediter(float montant)
	 {
		 solde-=montant;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "CompteBancaire [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", numero=" + numero + ", solde="
				+ solde + "]";
	}
	 public abstract String getNomComplet();
	 
}
