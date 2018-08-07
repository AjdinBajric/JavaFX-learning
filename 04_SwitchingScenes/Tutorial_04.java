import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_04 extends Application {

	Stage window;
	Scene scene1, scene2;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		Label label1 = new Label("Welcome to first scene!");

		Button button = new Button("About Me");
		button.setOnAction(e -> window.setScene(scene2));

		// Layout 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(button, label1);

		Scene scene1 = new Scene(layout1, 200, 200);

		Label label2 = new Label("My name is Ajdin and I am 17 years old.");

		// Button 2
		Button button2 = new Button("Home");
		button2.setOnAction(e -> window.setScene(scene1));

		// Layout2
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(button2, label2);
		scene2 = new Scene(layout2, 200, 200);

		window.setScene(scene1);
		window.setTitle("Unnamed");
		window.show();
	}

}
