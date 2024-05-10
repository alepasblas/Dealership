package com.example.dealership;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try {
            // Cargar el archivo FXML de la nueva escena
            FXMLLoader loader = new FXMLLoader(getClass().getResource("paginaPrincipal.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la nueva escena si es necesario
            // ControladorPaginaPrincipal controller = loader.getController();

            // Obtener el Stage actual
            Stage stage = (Stage) welcomeText.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Manejar cualquier error de carga de FXML
        }
    }
}