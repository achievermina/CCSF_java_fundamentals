package Assignment3;


import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import java.awt.Graphics;
import javafx.scene.paint.Color;


public class coloredSnowman extends Application {
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext pen = canvas.getGraphicsContext2D();
        pen.strokeOval(100, 50, 200, 200);
        pen.setFill(Color.BLACK);
        pen.fillOval(155, 100, 10, 20);
        pen.fillOval(230, 100, 10, 20);
        pen.setStroke(Color.RED);
        pen.strokeLine(200, 125,150, 140);
        pen.strokeLine(150, 140,200, 170);
        //fill stroke
        pen.setStroke(Color.BLACK);
        pen.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle(" Snow Man");
        primaryStage.setScene(scene);
        primaryStage.show();


    }





}
