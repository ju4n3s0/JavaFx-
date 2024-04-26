package icesi.aprendizajejavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,Color.BLACK);

        stage.setWidth(443);
        stage.setHeight(443);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't scape unless press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setTitle("Stage Demo Program ");

        stage.setScene(scene);
        stage.show();
    }
}