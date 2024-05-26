package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import myClasses.Motorcycle;

import java.io.IOException;

public class Yamaha {


    public javafx.scene.control.Button Button;
    public javafx.scene.control.Button add;

    public void onbuttonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) Button.getScene().getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void onAddClicked(ActionEvent actionEvent) throws IOException {
        myClasses.ShoppingCart.AddOneMoto(new Motorcycle("Yamaha", "YZ450", "This is a motocross bike", 10450, "4t Motorbike, a Japanese bike"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoppingCart.fxml"));
        Parent root = loader.load();
        com.example.dealership.ShoppingCart shoppingCartController = loader.getController();

        shoppingCartController.setText(myClasses.ShoppingCart.SeeAllBikes() + myClasses.ShoppingCart.SeeAllPieces());
        shoppingCartController.setPrice(myClasses.ShoppingCart.SeeAllPrices());
        shoppingCartController.setTotalPrice(myClasses.ShoppingCart.SeeAllPrices());

        Stage stage = (Stage) Button.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
