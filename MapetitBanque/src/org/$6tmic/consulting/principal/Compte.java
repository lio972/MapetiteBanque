package org.$6tmic.consulting.principal;

import java.math.BigDecimal;
import java.util.Date;

public class Compte {

	private String NumCompte;
	private Date dateOuvertureCompte = new Date();
	private Date dateClotureCompte = new Date();
	private String Devise;
	private BigDecimal soldeCompte;
	
	
	public Compte(){
		
	}
	
	/**
	 * @param numCompte
	 * @param dateOuvertureCompte
	 * @param dateClotureCompte
	 * @param devise
	 * @param soldeCompte
	 */
	public Compte(String numCompte, Date dateOuvertureCompte,
			Date dateClotureCompte, String devise, BigDecimal soldeCompte) {
		super();
		NumCompte = numCompte;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.dateClotureCompte = dateClotureCompte;
		Devise = devise;
		this.soldeCompte = soldeCompte;
	}	
	
	
	public String getNumCompte() {
		return NumCompte;
	}
	public void setNumCompte(String numCompte) {
		NumCompte = numCompte;
	}
	public Date getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	public void setDateOuvertureCompte(Date dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
	public Date getDateClotureCompte() {
		return dateClotureCompte;
	}
	public void setDateClotureCompte(Date dateClotureCompte) {
		this.dateClotureCompte = dateClotureCompte;
	}
	public String getDevise() {
		return Devise;
	}
	public void setDevise(String devise) {
		Devise = devise;
	}
	public BigDecimal getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(BigDecimal soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	
}
