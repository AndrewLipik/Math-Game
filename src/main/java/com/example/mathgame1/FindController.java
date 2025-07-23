package com.example.mathgame1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FindController implements Initializable {
    @FXML
    private Button close;
    @FXML
    private Label messageLabel;
    public void close(MouseEvent mouseEvent) {
        close.getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageLabel.setText(HelloController.find.getMessage());

    }
}
