package com.supinfo;

import java.util.List;

public class CompteCourant extends CompteBancaire 
{
	private double decouvertMaximal;
	private List<CompteCourant>CompteCourant;
	public void fixerDecouvertmaximal(float montant)
	{
		this.decouvertMaximal= montant;
	}
	public CompteCourant()
	{
		//constructeur explicite sans paramétres
		super();
	}
	public CompteCourant(int id,String prenom,String nom, int numero,
			float solde,double decouvertMaximal)
	{
		super(id,prenom,nom,numero,solde);
		this.decouvertMaximal= decouvertMaximal;
	}
	public void retirer(float montant,float solde)
	{
		solde= solde-montant;
	}
		
	public double getDecouvertMaximal() {
		return decouvertMaximal;
	}
	public void setDecouvertMaximal(double decouvertMaximal) {
		this.decouvertMaximal = decouvertMaximal;
	}
	public List<CompteCourant>getCompteCourant(){
		return CompteCourant;
	}
	@Override
	public String toString() {
		return super.toString()+",[decouvertMaximal="+ decouvertMaximal+"]";
	}
	@Override
	public String getNomComplet() {
		// 
		return "CompteBancaire:"+super.getPrenom()+" "+super.getNom();
	}

}
