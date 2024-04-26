package icesi.scenespractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.SKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("WHOOOOAAAA!!!");
        text.setY(50);
        text.setX(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(60);
        rectangle.setY(60);
        rectangle.setWidth(60);
        rectangle.setHeight(60);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.BLACK);

        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setCenterX(60);
        circle.setCenterY(60);
        circle.setFill(Color.ORANGE);


        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);

        stage.setScene(scene);
        stage.show();
    }

}