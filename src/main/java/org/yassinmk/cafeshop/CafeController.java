package org.yassinmk.cafeshop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.yassinmk.cafeshop.composant.*;
import org.yassinmk.cafeshop.decorator.*;

public class CafeController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView imageViewe;

    @FXML
    private Button expressoButton, cappuccinoButton, latteButton, macchiatoButton, americanoButton, ristrettoButton;

    @FXML
    private Button chocolatButton, caramelButton, vanilleButton, noisetteButton, cannelleButton, cremeChantillyButton;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private  TextArea CoutTextArea;

    private Boisson selectedBoisson;



    public void initialize() {
        String imageUrl = "file:D:\\\\Telechargement\\\\café-logo.png";
        // Load the image
        Image image = new Image(imageUrl);
        disableSupplements(true);

        // Add event handlers for coffee selection
        expressoButton.setOnAction(e -> selectBoisson(new Expresso()));
        cappuccinoButton.setOnAction(e -> selectBoisson(new Cappuccino()));
        latteButton.setOnAction(e -> selectBoisson(new Latte()));
        macchiatoButton.setOnAction(e -> selectBoisson(new Macchiato()));
        americanoButton.setOnAction(e -> selectBoisson(new Americano()));
        ristrettoButton.setOnAction(e -> selectBoisson(new Ristretto()));

        chocolatButton.setOnAction(e -> addSupplement("Chocolat"));
        caramelButton.setOnAction(e -> addSupplement("Caramel"));
        vanilleButton.setOnAction(e -> addSupplement("Vanille"));
        noisetteButton.setOnAction(e -> addSupplement("Noisette"));
        cannelleButton.setOnAction(e -> addSupplement("Cannelle"));
        cremeChantillyButton.setOnAction(e -> addSupplement("Crème Chantilly"));

        // Set the image to the ImageView
        imageViewe.setImage(image);
    }


    private void disableSupplements(boolean disable) {
        chocolatButton.setDisable(disable);
        caramelButton.setDisable(disable);
        vanilleButton.setDisable(disable);
        noisetteButton.setDisable(disable);
        cannelleButton.setDisable(disable);
        cremeChantillyButton.setDisable(disable);
    }

    // Add the selected supplement to the coffee
    private void addSupplement(String supplement) {
        if (selectedBoisson == null) {
            descriptionTextArea.setText("Please select a coffee first.");
            return;
        }

        switch (supplement) {
            case "Chocolat":
                selectedBoisson = new Chocolat(selectedBoisson);
                break;
            case "Caramel":
                selectedBoisson = new Caramel(selectedBoisson);
                break;
            case "Vanille":
                selectedBoisson = new Vanille(selectedBoisson);
                break;
            case "Noisette":
                selectedBoisson = new Noisette(selectedBoisson);
                break;
            case "Cannelle":
                selectedBoisson = new Cannelle(selectedBoisson);
                break;
            case "Crème Chantilly":
                selectedBoisson = new CremeChantilly(selectedBoisson);
                break;
        }

        updateDescription();
    }

    private void updateDescription() {
        if (selectedBoisson != null) {
            descriptionTextArea.setText(selectedBoisson.getDescription() );
            CoutTextArea.setText("Prix : "+selectedBoisson.cout() + " €");
        }
    }

    // Select the coffee and enable supplements
    private void selectBoisson(Boisson boisson) {
        this.selectedBoisson     = boisson;
        updateDescription();
        // Enable all supplement buttons when a coffee is selected
        disableSupplements(false);
    }

    // Add event handlers for supplements

}