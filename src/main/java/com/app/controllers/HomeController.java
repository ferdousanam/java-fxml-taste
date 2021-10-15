package com.app.controllers;

import com.components.ButtonController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private GridPane grid;
    @FXML
    private Button welcomeButton;

    @FXML
    protected void onGreetingsButtonClick() {
        welcomeText.setText("Welcome to Accounting Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        welcomeButton.setText("Custom");
        welcomeButton.setOnAction(e -> onGreetingsButtonClick());

//        for (int i = 0; i < 10; i++) {
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(getClass().getResource("views/components/button.fxml"));
//                Button button = fxmlLoader.load();
//
//                ButtonController buttonController = fxmlLoader.getController();
//                button.setText("Button " + i % 3 + " - " + i / 3);
//                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//                grid.add(button, i % 3, i / 3);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}