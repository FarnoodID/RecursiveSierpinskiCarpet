import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root =new Pane();
		drawCarpet(root, 0, 0, 243);
		Scene scene = new Scene (root,729,729);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void drawCarpet(Pane root,int x,int y,int side) {
		if (side<1) return;
		Rectangle rectangle = new Rectangle (x+side,y+side,side, side);
		if (side==81)rectangle.setFill(Color.ORANGE);
		if (side==27)rectangle.setFill(Color.BLUE);
		if (side==9)rectangle.setFill(Color.YELLOW);
		if (side==3)rectangle.setFill(Color.GREEN);
		if (side==1)rectangle.setFill(Color.RED);
		root.getChildren().add(rectangle);
		drawCarpet(root, x, y, side/3);
		drawCarpet(root, x+side, y, side/3);
		drawCarpet(root, x+side*2, y, side/3);
		drawCarpet(root, x, y+side, side/3);
		drawCarpet(root, x+side*2, y+side, side/3);
		drawCarpet(root, x, y+side*2, side/3);
		drawCarpet(root, x+side, y+side*2, side/3);
		drawCarpet(root, x+side*2, y+side*2, side/3);
	}

}
