package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MyAccount {
    @FXML
    private Label name;

    private String username;

    public void setUser(String username) {
        this.username = username;
        name.setText("Welcome, " + username);
    }

    @FXML
    public void onMyAccount() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MyAccount.fxml"));
            Parent root = loader.load();


            MyAccount myAccountController = loader.getController();
            myAccountController.setUser(username);

            Stage stage = (Stage) name.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logOutPressed(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) name.getScene().getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
