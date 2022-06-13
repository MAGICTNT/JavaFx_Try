package fr.mj.outil;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import javafx.scene.control.TextArea;

public class OutilImc {

	public static String calculeDeLImc(float taille, float poids) {
		float tailleValue = (float) Math.pow(taille/100, 2);
		return "votre IMC est de " + (poids/tailleValue);

	}	

}
