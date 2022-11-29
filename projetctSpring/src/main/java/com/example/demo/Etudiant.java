package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ETUDIANT")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "NUMERO")
	private int numero;

	@Column(name = "MATRICULE")
	private String matricule;

	@Column(name = "FILIER")
	private String filier;

	@Embedded
	private Adresse adresse;

	public Etudiant() {

	}

	@Override
	public String toString() {
		return "Etudiant [id = " + id + ", nom = " + nom + ", prenom = " + prenom + ", numero = " + numero + ", matricule = "
				+ matricule + ", filier = " + filier + ", adresse = " + adresse + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilier() {
		return filier;
	}

	public void setFilier(String filier) {
		this.filier = filier;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
