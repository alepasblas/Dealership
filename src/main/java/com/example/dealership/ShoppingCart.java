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
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    public Button continueShopping;
    public Label totalPrice;
    @FXML
    private Label price;
    @FXML
    private Label thingAdded;

    private double totalPrices = 0.0;


    public ShoppingCart() {
    }

    public void setPrice(List<Double> prices){
        String pricesText = prices.stream()
                .map(price -> String.format("%.2f", price))
                .collect(Collectors.joining("\n"));
        price.setText(pricesText);
    }

    public void setText(String text) {
        thingAdded.setText(text);
    }

    public void setTotalPrice(List<Double> prices) {
        double total = prices.stream().mapToDouble(Double::doubleValue).sum();
        totalPrice.setText(String.format("%.2f", total));
    }

    public void continueShopping(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) continueShopping.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    // Método para agregar el precio de un artículo al carrito
    public void addPrice(double price) {
        totalPrices += price;
        totalPrice.setText(String.format("%.2f", totalPrices)); // Actualizar la etiqueta del precio total
    }

}
