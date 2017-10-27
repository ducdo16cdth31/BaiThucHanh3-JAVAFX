package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<People> listPeople = new ArrayList<People>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form1.fxml"));
        Scene scene=new Scene(root,500,350);
        //scene.getStylesheets().add(getClass().getResource("bt3.css").toExternalForm());
        primaryStage.setTitle("Bài tập thực hành số 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
