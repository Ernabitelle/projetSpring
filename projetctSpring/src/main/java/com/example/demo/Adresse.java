package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	@Column(name = "PAYS")
	private String pays;

	@Column(name = "VILLE")
	private String ville;

	@Column(name = "RUE")
	private int rue;
	
	@Column(name="NOM_RUE")
	private String nomRue;

	@Column(name = "CODE_POSTAL")
	private int cp;

	public Adresse() {
	}

	
	@Override
	public String toString() {
		return "Adresse [pays = " + pays + ", ville = " + ville + ", rue = " + rue + ", nomRue = " + nomRue + ", code postal =" + cp
				+ "]";
	}


	public String getNomRue() {
		return nomRue;
	}


	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}


	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getRue() {
		return rue;
	}

	public void setRue(int rue) {
		this.rue = rue;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	
}
