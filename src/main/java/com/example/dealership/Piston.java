package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import myClasses.Motorcycle;
import myClasses.Pieces;

import java.io.IOException;

public class Piston {
    public Button Button;
    public Button add;

    public void onbuttonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) Button.getScene().getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void onAddClicked(ActionEvent actionEvent) throws IOException {
        double pistonPrice = 124.43; // Precio del pistón
        myClasses.ShoppingCart.AddOnePiece(new Pieces("Piston", pistonPrice, "This is a piston for a bike engine"));

        // Cargar el controlador del ShoppingCart
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoppingCart.fxml"));
        Parent root = loader.load();
        com.example.dealership.ShoppingCart shoppingCartController = loader.getController();

        // Actualizar el texto en el ShoppingCart
        shoppingCartController.setText(myClasses.ShoppingCart.SeeAllBikes() + myClasses.ShoppingCart.SeeAllPieces());
        shoppingCartController.setPrice(myClasses.ShoppingCart.SeeAllPrices());
        shoppingCartController.setTotalPrice(myClasses.ShoppingCart.SeeAllPrices());

        // Mostrar la nueva escena
        Stage stage = (Stage) Button.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
