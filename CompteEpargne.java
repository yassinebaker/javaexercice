package com.supinfo;

import java.util.List;

public class CompteEpargne extends CompteBancaire {
	private float tauxInteret=0;
	private List<CompteEpargne>CompteEpargne;
	public CompteEpargne() 
	{
		//constructeur explicite sans paramétres
		super();
	}
	public CompteEpargne(int id,String prenom,String nom, int numero,
			float solde, float tauxInteret)
	{
		super(id,prenom,nom,numero,solde);
		this.tauxInteret =tauxInteret;
	}
	public void calculInteret(float solde)
	{
		solde = solde*(1+tauxInteret/100);
	}
	

	public float getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public List<CompteEpargne> getCompteEpargne() {
		return CompteEpargne;
	}
	public void setCompteEpargne(List<CompteEpargne> compteEpargne) {
		CompteEpargne = compteEpargne;
	}
	@Override
	public String toString()
	{
		return super.toString()+",[tauxInteret="+tauxInteret+"]";
	}
	@Override
	public String getNomComplet() {
		
		return "CompteBancaire:"+super.getPrenom()+" "+super.getNom();
	}

}
