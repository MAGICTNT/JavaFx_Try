package application;


import fr.mj.outil.OutilConversion;
import fr.mj.outil.OutilImage;
import fr.mj.poid.Imc;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SampleController {
	
@FXML
Label resultat;
@FXML
Button button;
@FXML
TextArea taille;
@FXML
TextArea poids;
@FXML
ImageView imageView ;




@FXML
public void initialize() {
	resultat.setText("Entrez votre taille et votre poids");
}


@FXML
public void calculerIMC() {
	
		Imc imc = new Imc(taille.getText(),poids.getText());
		
		if(imc.isCorrect())
		{
			resultat.setText("Votre imc est de: " + imc.getImc());
			Image image = new Image("C:\\java\\workspace\\imc\\" + OutilImage.chargementImageImc(imc.getImc()));
			imageView.setImage(image);
		}
		else
		{
			resultat.setText("Saisie incorrect");
		}

	//	resultat.setText( Outil.calculeDeLImc(Outil.convertiseur(taille),Outil.convertiseur(poids)) );

}


	
}
