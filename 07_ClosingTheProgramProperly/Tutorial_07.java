import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tutorial_07 extends Application {

	Stage window;
	Button btn;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Application");
		window.setOnCloseRequest(e -> {

			e.consume(); //consume that event, we got it from here 
			closeProgram();

		});

		btn = new Button("Close window");
		btn.setOnAction(e -> closeProgram());

		StackPane layout = new StackPane();
		layout.getChildren().add(btn);

		Scene scene = new Scene(layout, 200, 200);
		window.setScene(scene);
		window.show();

	}

	private void closeProgram() {

		Boolean answer = ConfirmBox.display("Save your file", "Sure you want to exit?");

		if (answer)
			window.close();
	}

}
