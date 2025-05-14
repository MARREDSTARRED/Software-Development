import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.StackPane;
import javafx.collections.ObservableList;
import javafx.animation.FadeTransition;

public class PathTransitionDemo extends Application {
@Override // Override the start method in the Application class 
 public void start(Stage primaryStage) {
// Create a pane
StackPane stackPane = new StackPane();
     Pane pane = new Pane();
// Create a rectangle

     
     
     Rectangle rectangle = new Rectangle (0, 0, 25, 50);
rectangle.setFill(Color.ORANGE);

FadeTransition fadeTransition = new FadeTransition(Duration.millis(4000));
fadeTransition.setNode(rectangle);
fadeTransition.setFromValue(1.0);
fadeTransition.setToValue(0.3);
fadeTransition.setCycleCount(50);
fadeTransition.setAutoReverse(false);
fadeTransition.play();

Polygon polygon = new Polygon();
stackPane.getChildren().add(polygon);
polygon.setFill(Color.WHITE);
polygon.setStroke(Color.BLACK);

ObservableList<Double> list = polygon.getPoints();

final double WIDTH = 200, HEIGHT = 200;
double centerX = WIDTH / 2, centerY = HEIGHT / 2;
double radius = Math.min(WIDTH, HEIGHT) * 0.4;

		
for (int i = 0; i < 5; i++) {
list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
}





pane.getChildren().add(rectangle);

PathTransition pt = new PathTransition();
pt.setDuration(Duration.millis(4000));

pt.setPath(polygon);
pt.setNode(rectangle);

pt.setOrientation(
PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
pt.setCycleCount(Timeline.INDEFINITE);
pt.setAutoReverse(false);
pt.play(); // Start animation
polygon.setOnMousePressed(e -> pt.pause());
polygon.setOnMouseReleased(e -> pt.play());

Scene scene = new Scene(pane, 250, 200);
primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}
}