package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ShoppingCart {
    public Button continueShopping;
    public Label totalPrice;
    @FXML
    private Label price;
    @FXML
    private Label thingAdded;

    public ShoppingCart() {
    }

    public void setPrice(String prices){
        price.setText(prices);
    }
    public void setText(String text) {
        thingAdded.setText(text);
    }

    public void setTotalPrice(){
        //Hacer la suma de todos los productos y ponerlo aqui

    }

    public void continueShopping(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) continueShopping.getScene().getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
