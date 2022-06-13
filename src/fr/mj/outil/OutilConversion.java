package fr.mj.outil;

import java.math.BigDecimal;

import fr.mj.poid.Imc;
import javafx.scene.control.TextArea;

public class OutilConversion {
	public static float convertiseur(TextArea convertir) {
		float conversion = 0;
		try {
			 conversion = new BigDecimal(convertir.getText()).intValue();
		}catch(Exception e) {
		}
		return conversion;
	}
}
