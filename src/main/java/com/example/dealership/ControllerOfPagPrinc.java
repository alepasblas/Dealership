package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControllerOfPagPrinc {
    public ImageView gasgas;
    public ImageView yamaha;
    public MenuItem logOut;
    public ImageView sparkPlug;
    public ImageView piston;
    public TextField review;
    public Button post;
    public VBox reviewsBox;

    private List<ReviewEntry> reviewEntries = new ArrayList<>();

    public void onGasgasClicked(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GasGas.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onShoppingCart(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoppingCart.fxml"));
        Parent root = loader.load();
        com.example.dealership.ShoppingCart shoppingCartController = loader.getController();


        // Update the shopping cart text
        shoppingCartController.setText(myClasses.ShoppingCart.SeeAllBikes() + myClasses.ShoppingCart.SeeAllPieces());
        shoppingCartController.setPrice(myClasses.ShoppingCart.SeeAllPrices());
        shoppingCartController.setTotalPrice(myClasses.ShoppingCart.SeeAllPrices());

        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onYamahaClicked(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Yamaha.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onLogoutPressed(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onMyAccount(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MyAccount.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onSparkClicked(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Spark.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void onPistonClicked(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Piston.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) gasgas.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onPostClicked(MouseEvent mouseEvent) {
        String newReview = review.getText();
        if (!newReview.isEmpty()) {
            // Create a Label for the review
            Label reviewLabel = new Label(newReview);
            // Create a delete button next to the Label
            Button deleteButton = new Button("Delete");
            Button editButton = new Button("Edit");

            deleteButton.setOnAction(e -> {
                reviewsBox.getChildren().remove(reviewLabel);
                reviewsBox.getChildren().remove(deleteButton);
                reviewsBox.getChildren().remove(editButton);
                reviewEntries.removeIf(entry -> entry.label == reviewLabel);
            });

            editButton.setOnAction(e -> {
                review.setText(reviewLabel.getText());
                reviewEntries.removeIf(entry -> entry.label == reviewLabel);
                reviewsBox.getChildren().remove(reviewLabel);
                reviewsBox.getChildren().remove(deleteButton);
                reviewsBox.getChildren().remove(editButton);
            });

            // Add the Label and buttons to the VBox
            reviewsBox.getChildren().addAll(reviewLabel, deleteButton, editButton);
            reviewEntries.add(new ReviewEntry(reviewLabel, deleteButton, editButton));

            review.clear();
        }
    }


    private static class ReviewEntry {
        Label label;
        Button deleteButton;
        Button editButton;

        ReviewEntry(Label label, Button deleteButton, Button editButton) {
            this.label = label;
            this.deleteButton = deleteButton;
            this.editButton = editButton;
        }
    }
}
