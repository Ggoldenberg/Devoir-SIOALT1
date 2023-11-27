package sio.devoir1sioalt;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;

public class DevoirController implements Initializable {

    @FXML
    private Button btnExo1;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private Button btnExo2;
    @FXML
    private Slider sldNbLignes;
    @FXML
    private TextArea txtTriangle;
    @FXML
    private Button btnExo3;
    @FXML
    private Button btnDessiner;
    @FXML
    private TextField txtNbJours;
    @FXML
    private TextField txtNbEleves;
    @FXML
    private TextField txtCoutGlobal;
    @FXML
    private Button btnCalculer;
    @FXML
    private Button btnJouer;
    @FXML
    private TextArea txtResultatsTirages;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        apExo1.toFront();
    }

    @FXML
    public void btnExosMenuClicked(Event event)
    {
        if(event.getSource() == btnExo1)
        {
            apExo1.toFront();
        }
        else if(event.getSource() == btnExo2)
        {
            apExo2.toFront();
        }
        else
        {
            apExo3.toFront();;
        }
    }

    // Exercice n°1
    @FXML
    public void btnCalculerClicked(Event event)
    {
        if (txtNbJours.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombre de jours");
            alert.showAndWait();
        } else if (txtNbEleves.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombre d'élèves");
            alert.showAndWait();
        }


        int nbrJours = Integer.parseInt(txtNbJours.getText());
        int nbrEleves = Integer.parseInt(txtNbEleves.getText());
        double coutGlobal = 0;

        if (nbrEleves <= 25){
                coutGlobal = coutGlobal + (nbrEleves * 67.30);

        }else {
                coutGlobal = coutGlobal + (nbrEleves * 61);

        }

        coutGlobal = coutGlobal + (nbrEleves * nbrJours * 3.50);


        if (nbrEleves <= 30){
            coutGlobal = coutGlobal + (nbrEleves * nbrJours * 4.75);

        } else if (nbrEleves > 35) {
            coutGlobal = coutGlobal + (nbrEleves * nbrJours * 3.50);

        } else {
            coutGlobal = coutGlobal + (nbrEleves * nbrJours * 4);
        }

        txtCoutGlobal.setText(String.valueOf(coutGlobal));


    }

    // Exercice n°2
    @FXML
    public void btnDessinerClicked(Event event)
    {
        int valeurLigne = (int) sldNbLignes.getValue();
        String ligne = "";
        String colonne = "";

        for (int i = 1; i <= sldNbLignes.getValue(); i++) {
            ligne = ligne + String.valueOf(valeurLigne);


            for (int j = (int) sldNbLignes.getValue(); j >= 1; j--) {
                colonne = colonne + j + "\n";
            }
        }

        txtTriangle.setText(ligne + colonne);
    }

    // Exercice n°3
    @FXML
    public void btnJouerClicked(Event event)
    {
        // A vous de jouer

    }
}