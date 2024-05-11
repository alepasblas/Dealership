package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Controller {
    public TextField UserInputLogIn;
    public TextField PasswordInputLogIn;
    @FXML
    private Label welcomeText;



    public void onEnterLogIn(ActionEvent actionEvent)
    {
        try {
            String user = UserInputLogIn.getText();
            String password= PasswordInputLogIn.getText();
            List<String> users= Files.readAllLines(Path.of("src/main/resources/Users.txt"));
            List<String> passwords= Files.readAllLines(Path.of("src/main/resources/Passwords.txt"));

            for(int i=0; i< users.size(); i++)
            {
                if(Objects.equals(users.get(i), user) && Objects.equals(passwords.get(i), password))
                {
                    // Cargar el archivo FXML de la nueva escena
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("paginaPrincipal.fxml"));
                    Parent root = loader.load();


                    // Obtener el Stage actual
                    Stage stage = (Stage) welcomeText.getScene().getWindow();

                    // Establecer la nueva escena en el Stage
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else
                {
                    System.out.println("User or password incorrect");
                }
            }

        } catch (IOException e) {
            e.printStackTrace(); // Manejar cualquier error de carga de FXML
        }
    }
}