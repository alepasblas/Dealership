package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ControllerOfPagPrinc {
    public ImageView gasgas;
    public ImageView yamaha;
    public MenuItem logOut;
    public ImageView sparkPlug;
    public ImageView piston;
    public TextArea textReview;
    public TextField review;
    public Button post;
    public Label reviews;


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

        String bikesText = myClasses.ShoppingCart.SeeAllBikes();
        List<Double> prices = myClasses.ShoppingCart.SeeAllPrices();

        // Actualizar el texto en el ShoppingCart
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
        // Obtén el texto actual del Label reviews
        String currentReviews = reviews.getText();

        // Añade el nuevo texto del TextField review al texto actual
        String newReview = review.getText();
        if (!newReview.isEmpty()) {
            if (!currentReviews.isEmpty()) {
                currentReviews += "\n";
            }
            currentReviews += newReview;
        }

        // Establece el texto combinado en el Label reviews
        reviews.setText(currentReviews);

        // Limpia el TextField review
        review.clear();
    }
}
