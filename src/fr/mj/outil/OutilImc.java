package fr.mj.outil;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import javafx.scene.control.TextArea;

public class OutilImc {

	public static String calculeDeLImc(float taille, float poids) {
			float tailleValue = (float) Math.pow(taille/100, 2);
			StringBuilder stringBuilder = new StringBuilder();
			StringBuilder imc = new StringBuilder();
			stringBuilder.append(poids/tailleValue);
			imc.append(stringBuilder.subSequence(0, 5));
			return "" + imc;
	}
	
	public static boolean verrification(float taille, float poids) {
		try {
			 return true;
		}catch(Exception e) {
			return false;
		}
	}



	
}
