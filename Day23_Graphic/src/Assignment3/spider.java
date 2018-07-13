package Assignment3;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;


public class spider extends Application {

    public static void main(String[] args){

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(150, 150);
        GraphicsContext sp = canvas.getGraphicsContext2D();
        sp.setFill(Color.BLACK);
        sp.fillOval(185, 185, 30, 30);
        sp.strokeOval(175, 175, 50, 50);
        //fill stroke
        sp.strokeArc(150, 160, 75, 50, 180, -180, ArcType.OPEN);
        root.getChildren().add(canvas);
        primaryStage.setTitle(" SAD Face");
        primaryStage.setScene(scene);
        primaryStage.show();


    }



}
