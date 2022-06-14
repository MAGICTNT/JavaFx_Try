package fr.mj.outil;

public class OutilImage {

	private OutilImage() {}
	
	public static String chargementImageImc(String valeurImc) {
		Float imc = Float.valueOf(valeurImc);
		
		if(imc <18.5)
			return "image1.png";
		else if(imc >15.6 && imc <25)
			return "image2.png";
		else if(imc > 25 && imc <30)
			return "image3.png";
		else if(imc > 30 && imc <35)
			return "image4.png";
		else if(imc > 35 && imc < 40)
			return "image5.png";
		else 
			return "image6.png";

	}
	
}
