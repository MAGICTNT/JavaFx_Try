package application;


import fr.mj.outil.OutilConversion;
import fr.mj.poid.Imc;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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
public void initialize() {
	resultat.setText("Entrez votre taille et votre poids");
}

@FXML
public void calculerIMC() {
	
		Imc imc = new Imc(OutilConversion.convertiseur(taille),OutilConversion.convertiseur(poids));
		
		if(imc.isCorrect())
		{
			resultat.setText(imc.getImc());
		}
		else
		{
			resultat.setText("Saisie incorrect");
		}

	//	resultat.setText( Outil.calculeDeLImc(Outil.convertiseur(taille),Outil.convertiseur(poids)) );

}


	
}
