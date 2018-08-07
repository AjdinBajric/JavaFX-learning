import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tutorial_06 extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Title");

		button = new Button("Click me");
		button.setOnAction(e -> {
			ConfirmBox.display("AlertBox", "Sign up/Sign in before you start!");
			System.out.println(ConfirmBox.answer);
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();

	}

}
