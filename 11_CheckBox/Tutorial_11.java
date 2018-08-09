
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_11 extends Application {

	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Restaurant");

		// CheckBoxes

		CheckBox box1 = new CheckBox("tuna");
		CheckBox box2 = new CheckBox("bacon");
		box1.setSelected(true); // default value

		// Button

		button = new Button("Order Now!");
		button.setOnAction(e -> handleOptions(box1, box2));

		// Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(box1, box2, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private void handleOptions(CheckBox box1, CheckBox box2) {

		String message = "Users order: ";

		if (box1.isSelected())
			message += "Tuna, ";
		if (box2.isSelected())
			message += "Bacon.";

		System.out.println(message);
	}

}