package com.example.cdm;

import com.example.cdm.models.BaseDatos;
import com.example.cdm.models.Coach;
import com.example.cdm.models.Deportista;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.cdm.models.BaseDatos.deportista;

public class HelloApplication extends Application {
    public static Object setFXML;
    private static Stage stage;
    private static Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
        BaseDatos.coach.add(new Coach("Cristian","Ovando",19,"222156@gmail.com","Cristian O","123"));
        BaseDatos.deportista.add(new Deportista("Martin","Ochoa",19,"222156@gmail.com",70,172,"Martin O","123"));
        BaseDatos.deportista.add(new Deportista("Diego","Ortis",19,"222156@gmail.com",850,175,"Diego O","123"));
        this.stage = stage;
        scene = new Scene(loadFXML("Login-view"));
        stage.setTitle("Login-CDMgyms");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }



    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView +".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String newView, String Title){
        scene.setRoot(loadFXML(newView));
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(Title);

    }

    public static void main(String[] args) {
        launch();
    }
}