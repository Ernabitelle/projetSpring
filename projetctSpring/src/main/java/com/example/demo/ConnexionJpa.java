package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("university");
		EntityManager em = factory.createEntityManager();

		EntityTransaction trans = em.getTransaction();
//
//		trans.begin();
//		
//		// Creation d'une adresse pas de persist
//		Adresse adr = new Adresse();
//		adr.setPays("Tunisie");
//		adr.setVille("Gabes");
//		adr.setRue(12);
//		adr.setNomRue("Mtorrech");
//		adr.setCp(6505);
//		
//		Etudiant martin = new Etudiant();
//		martin.setNom("Martin");
//		martin.setPrenom("Raïssa");
//		martin.setMatricule("KM18002");
//		martin.setFilier("Informatique");
//		martin.setNumero(52831928);
//		martin.setAdresse(adr);
//		em.persist(martin);
//		
//		
//		Adresse adr1 = new Adresse();
//		adr1.setPays("France");
//		adr1.setVille("Montpellier");
//		adr1.setRue(8);
//		adr1.setNomRue("Rue Roseraie");
//		adr1.setCp(34700);
//		
//		
//		Etudiant kassime = new Etudiant();
//		kassime.setNom("Kassime");
//		kassime.setPrenom("Nidhal");
//		kassime.setMatricule("KM18003");
//		kassime.setFilier("Informatique");
//		kassime.setNumero(766607390);
//		kassime.setAdresse(adr1);
//		em.persist(kassime);
//		
//		
//		Adresse adr2 = new Adresse();
//		adr2.setPays("France");
//		adr2.setVille("Marseille");
//		adr2.setRue(36);
//		adr2.setNomRue("Rue du jet d eau");
//		adr2.setCp(13003);
//		
//		Etudiant alma = new Etudiant();
//		alma.setNom("Kassime");
//		alma.setPrenom("Alma");
//		alma.setMatricule("KM180012");
//		alma.setFilier("Biologie");
//		alma.setNumero(72803198);
//		alma.setAdresse(adr2);
//		em.persist(alma);
//		
//		
//		
//		Adresse adr3 = new Adresse();
//		adr3.setPays("Mayotte");
//		adr3.setVille("Labatoire");
//		adr3.setRue(11);
//		adr3.setNomRue("Charles de Gaule");
//		adr3.setCp(2435);
//		
//		Etudiant angel = new Etudiant();
//		angel.setNom("Martin");
//		angel.setPrenom("Angel Gabriel");
//		angel.setMatricule("KM18004");
//		angel.setFilier("Aeraunotique");
//		angel.setNumero(42831928);
//		angel.setAdresse(adr3);
//		em.persist(angel);
//		
//
//		Adresse adr4 = new Adresse();
//		adr4.setPays("Maldives");
//		adr4.setVille("Malé");
//		adr4.setRue(12);
//		adr4.setNomRue("Rue de Conch");
//		adr4.setCp(12021);
//		
//		Etudiant erna = new Etudiant();
//		erna.setNom("Kassime");
//		erna.setPrenom("Erna Bittel");
//		erna.setMatricule("KM18005");
//		erna.setFilier("Médecine");
//		erna.setNumero(42831928);
//		erna.setAdresse(adr4);
//		em.persist(erna);
//		
//		// Creation d'une adresse pas de persist
//		Adresse adr5 = new Adresse();
//		adr5.setPays("USA");
//		adr5.setVille("Los Angeles");
//		adr5.setRue(12);
//		adr5.setNomRue("Tree Heall");
//		adr5.setCp(17654);
//		
//		Etudiant jeff = new Etudiant();
//		jeff.setNom("Colbee");
//		jeff.setPrenom("Jeff");
//		jeff.setMatricule("KM18012");
//		jeff.setFilier("Chimie");
//		jeff.setNumero(85831928);
//		jeff.setAdresse(adr5);
//		em.persist(jeff);
//		
//	
//		
//
//		Enseignant abdou = new Enseignant();
//		abdou.setNom("Abdou");
//		abdou.setPrenom("Mohamed");	
//		abdou.setMatricule("NVDF5");
//		abdou.setMatiere("Maths");
//		abdou.setNumero(041236);
//		em.persist(abdou);
//		
//		Enseignant marwan = new Enseignant();
//		marwan.setNom("marwan");
//		marwan.setPrenom("Mohamed");	
//		marwan.setMatricule("NJDF5");
//		marwan.setMatiere("Informatique");
//		marwan.setNumero(1421236);
//		em.persist(marwan);
//		
//		Enseignant dalel = new Enseignant();
//		dalel.setNom("Dalel");
//		dalel.setPrenom("Baghdad");	
//		dalel.setMatricule("k5DF5");
//		dalel.setMatiere("Cimie");
//		dalel.setNumero(0041236);
//		em.persist(dalel);
//		
//		Administrateur robert = new Administrateur();
//		robert.setNom("Robert");
//		robert.setPrenom("François");	
//		robert.setMatricule("FR1278654");
//		robert.setNumero(412313426);
//		em.persist(robert);
//		
//		Administrateur olivier = new Administrateur();
//		olivier.setNom("Sebastian");
//		olivier.setPrenom("Olivier");	
//		olivier.setMatricule("FR1279654");
//		olivier.setNumero(412213426);
//		em.persist(olivier);
//		
//		Administrateur chris = new Administrateur();
//		chris.setNom("Hummels");
//		chris.setPrenom("Chris");	
//		chris.setMatricule("FR1179654");
//		chris.setNumero(415213426);
//		em.persist(chris);
//		
//		
//		
//		Administrateur ibouroiChahe = em.find(Administrateur.class, 1);
//		ibouroiChahe.setPrenom("Chahe");
//		em.persist(ibouroiChahe);
//
//		trans.commit();
		
	

		Etudiant etudiant = em.find(Etudiant.class, 2);

		Enseignant enseignant = em.find(Enseignant.class, 2);

		Administrateur adm = em.find(Administrateur.class, 1);

		System.out.println(etudiant + "\n " + enseignant + "\n " + adm);

	}

}
