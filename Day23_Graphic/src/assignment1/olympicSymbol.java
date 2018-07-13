package assignment1;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;


public class olympicSymbol extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext olympic = canvas.getGraphicsContext2D();
        olympic.strokeOval(50, 50, 50, 50);
        olympic.strokeOval(110, 50, 50, 50);
        olympic.strokeOval(170, 50, 50, 50);
        olympic.strokeOval(80, 75, 50, 50);
        olympic.strokeOval(140, 75, 50, 50);

        root.getChildren().add(canvas);
        primaryStage.setTitle(" Olympic Symbol");
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}

