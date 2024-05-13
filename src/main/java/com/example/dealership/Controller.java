package com.example.dealership;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Controller {
    public TextField UserInputLogIn;
    public TextField PasswordInputLogIn;
    public TextField UserRegister;
    public TextField PasswordRegister;
    @FXML
    private Label welcomeText;



    public void onEnterLogIn(ActionEvent actionEvent)
    {
        try {
            String user = UserInputLogIn.getText();
            String password= PasswordInputLogIn.getText();
            List<String> users= Files.readAllLines(Path.of("src/main/resources/Files/Users.txt"));
            List<String> passwords= Files.readAllLines(Path.of("src/main/resources/Files/Passwords.txt"));

            for(int i=0; i< users.size(); i++)
            {
                if(Objects.equals(users.get(i), user) && Objects.equals(passwords.get(i), password))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("princPage.fxml"));
                    Parent root = loader.load();


                    Stage stage = (Stage) welcomeText.getScene().getWindow();

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

    public void onEnterRegister(ActionEvent actionEvent)
    {
        try {
            String user = UserRegister.getText();
            String password= PasswordRegister.getText();

            FileWriter users = new FileWriter("src/main/resources/File/Users.txt", true);

            BufferedWriter usersU = new BufferedWriter(users);

            usersU.write("\n"+user );

            usersU.close();

            FileWriter passwords = new FileWriter("src/main/resources/Files/Passwords.txt", true);

            BufferedWriter passwordsB = new BufferedWriter(passwords);

            passwordsB.write("\n"+password);

            passwordsB.close();

            System.out.println("New user created");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}