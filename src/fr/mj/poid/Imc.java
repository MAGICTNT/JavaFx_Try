package fr.mj.poid;

import fr.mj.outil.OutilImc;

public class Imc {
	private float taille;
	private float poids;
	private String imc;
	private boolean correct;


	public Imc(float taille, float poids) {
		this.taille = taille;
		this.poids = poids;
		correct = true;
		imc = OutilImc.calculeDeLImc(taille,poids);
	}
	
	
	public boolean isCorrect() {
		return correct;
	}
	
	public void pasCorrect() {
		correct = false;
	}


	public String getImc() {
		return imc;
	}


	
	
	
}
