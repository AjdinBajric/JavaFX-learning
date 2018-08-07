import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConfirmBox {

	static boolean answer;

	public static void display(String title, String message) {

		Stage window = new Stage();
		window.setTitle(title);

		Button yes = new Button("Yes");
		Button no = new Button("No");
		Label label1 = new Label(message);

		yes.setOnAction(e -> {

			answer = true;
			window.close();

		});

		no.setOnAction(e -> {

			answer = false;
			window.close();
		});

		VBox layout = new VBox();
		layout.getChildren().addAll(label1, yes, no);
		layout.setAlignment(Pos.TOP_CENTER);

		Scene scene = new Scene(layout, 250, 250);
		window.setScene(scene);
		window.showAndWait();
	}

}
