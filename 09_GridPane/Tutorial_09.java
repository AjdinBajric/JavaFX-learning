import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tutorial_09 extends Application {

	Stage window;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Title");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);

		// Name label
		Label label = new Label("Username");
		GridPane.setConstraints(label, 0, 0);

		// Name input
		TextField nameInput = new TextField("Ajdin");
		GridPane.setConstraints(nameInput, 1, 0);

		// Password label

		Label pass = new Label("Password");
		GridPane.setConstraints(pass, 0, 1);

		// Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);

		Button login = new Button("Login");
		GridPane.setConstraints(login, 1, 2);

		grid.getChildren().addAll(label, nameInput, pass, passInput, login);

		Scene scene = new Scene(grid,400,300);
		window.setScene(scene);
		window.show();

	}

}
