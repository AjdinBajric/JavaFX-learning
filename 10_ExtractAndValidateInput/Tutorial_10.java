import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_10 extends Application {

	Stage window;
	Button btn;
	Scene scene;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Title");

		// Form

		TextField message = new TextField();

		btn = new Button("Sign Up");
		btn.setOnAction(e -> isInt(message, message.getText()));

		// Layout

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(15));
		layout.getChildren().addAll(message, btn);

		scene = new Scene(layout, 400, 200);
		window.setScene(scene);
		window.show();

	}

	private boolean isInt(TextField input, String message) {

		try {
			int age = Integer.parseInt(message);
			System.out.println("User is " + age + " years old.");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Error " + message + " is not number");
			return false;
		}

	}

}
