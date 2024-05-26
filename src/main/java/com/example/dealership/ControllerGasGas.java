package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import myClasses.Motorcycle;
import myClasses.Pieces;
import myClasses.ShoppingCart;

import java.io.IOException;

public class ControllerGasGas {
    public javafx.scene.control.Button Button;

    public void onbuttonClicked(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) Button.getScene().getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void onAddClicked(ActionEvent actionEvent) throws IOException {
        ShoppingCart.AddOneMoto(new Motorcycle("GasGas", "MC450", "This is a motocross bike", 12000, "4t Motorbike, very nice"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoppingCart.fxml"));
        Parent root = loader.load();
        com.example.dealership.ShoppingCart shoppingCartController = loader.getController();

        shoppingCartController.setText(myClasses.ShoppingCart.SeeAllBikes() + myClasses.ShoppingCart.SeeAllPieces());
        shoppingCartController.setPrice(ShoppingCart.SeeAllPrices());
        shoppingCartController.setTotalPrice(ShoppingCart.SeeAllPrices());

        Stage stage = (Stage) Button.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}



