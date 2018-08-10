import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_14 extends Application {

	Stage window;
	Scene scene;
	Button button;
	ComboBox<String> comboBox;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ComboBox Demo");
		button = new Button("Submit");
		button.setOnAction(e -> printMovie(comboBox));

		comboBox = new ComboBox();
		comboBox.getItems().addAll("Good will hunting", "St. Vincent", "Blackhat", "Add your favourite movie");

		comboBox.setPromptText("What is your favourite movie? ");
		comboBox.setOnAction(e -> System.out.println(comboBox.getValue())); // before the user submit
		comboBox.setEditable(true);

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(comboBox, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private void printMovie(ComboBox c_box) {
		System.out.println(c_box.getValue());
	}
}