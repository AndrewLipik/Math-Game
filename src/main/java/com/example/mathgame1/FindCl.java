package com.example.mathgame1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FindCl {
    private String message;
    public String getMessage(){
        return message;
    }
    public FindCl(String message){
        this.message=message;
    }

    public void call() {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("find.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 200);
            stage.setTitle(message);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){

        }
    }
}
