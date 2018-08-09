
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_12 extends Application {

	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("ChoiceBox Demo");

		Label label = new Label("Choose your favourite fruit");

		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().addAll("Apples", "Bananas", "Pineapples", "Watermelon", "Pear", "Peach");

		button = new Button("Click me");
		button.setOnAction(e -> getChoice(choiceBox));

		// Set a default value
		choiceBox.setValue("Apples");

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(label, choiceBox, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private void getChoice(ChoiceBox<String> choiceBox) {
		String food = choiceBox.getValue();
		System.out.println("Users favourite fruit is: " + food);
	}

}
