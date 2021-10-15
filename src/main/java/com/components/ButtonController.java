package com.components;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ButtonController {
    @FXML
    private Button button;

    public Button getButton() {
        return button;
    }

    public void setButtonText(String buttonText) {
        button.setText(buttonText);
    }

    public void onPressButton(ActionEvent actionEvent) {
        System.out.println(actionEvent);
        System.out.println("Button Pressed");
    }
}
