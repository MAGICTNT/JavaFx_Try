package fr.mj.poid;

import fr.mj.outil.OutilConversion;
import fr.mj.outil.OutilImc;
import javafx.scene.control.TextArea;

public class Imc {
	private float taille;
	private float poids;
	private String imc;
	private boolean correct;


	public Imc(String tailleRecup, String poidsRecup) {
		try {
			this.taille = OutilConversion.convertiseur(tailleRecup);
			this.poids = OutilConversion.convertiseur(poidsRecup);
			correct = true;
			imc = OutilImc.calculeDeLImc(this.taille,this.poids );
		}catch(Exception e) {
			correct = false;
		}
	}
	
	
	public boolean isCorrect() {
		return correct;
	}
	

	public String getImc() {
		return imc;
	}
	
	


	
	
	
}
