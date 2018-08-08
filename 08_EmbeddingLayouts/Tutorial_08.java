import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_08 extends Application {

	Stage window;
	Button btn1, btn2, btn3, btn4, btn5, btn6;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Title");

		HBox topMenu = new HBox();

		btn1 = new Button("File");
		btn2 = new Button("Edit");
		btn3 = new Button("View");

		topMenu.getChildren().addAll(btn1, btn2, btn3);

		VBox leftMenu = new VBox();

		btn4 = new Button("F");
		btn5 = new Button("E");
		btn6 = new Button("V");

		leftMenu.getChildren().addAll(btn4, btn5, btn6);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);

		Scene scene = new Scene(borderPane, 200, 200);
		window.setScene(scene);
		window.show();

	}

}
