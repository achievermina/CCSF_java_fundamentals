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
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext sp = canvas.getGraphicsContext2D();
        sp.setFill(Color.BLUE);
        sp.fillOval(185, 185, 30, 30);
        sp.setStroke(Color.RED);
        sp.strokeOval(175, 175, 50, 50);
        //fill stroke
        sp.setStroke(Color.GREEN);
        sp.strokeArc(225, 160, 80, 75, 90, 180, ArcType.OPEN);
        sp.strokeArc(160, 100, 80, 75, 180, 180, ArcType.OPEN);
        sp.strokeArc(95, 160, 80, 75, 270, 180, ArcType.OPEN);
        sp.strokeArc(160, 225, 80, 75, 180, -180, ArcType.OPEN);



        root.getChildren().add(canvas);
        primaryStage.setTitle("Spider");
        primaryStage.setScene(scene);
        primaryStage.show();



    }



}
