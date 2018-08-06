/*
 * 
 * Made two overlapping buttons xD
 * 
 * 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tutorial_03 extends Application {

	Button button, button2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Title of Window");

		// first button
		button = new Button();
		button.setText("Click Me");

		// second button
		button2 = new Button("!Hi");

		button2.setOnAction(e -> System.out
				.println("Lambda expressions are awesome!"));

		// or

		button.setOnAction(e -> {
			int a = 4; // :P
			if (a == 4) { // :P
				System.out.println("Hi!");
			}
		});

		StackPane layout = new StackPane();

		layout.getChildren().add(button);
		layout.getChildren().add(button2);

		Scene scene = new Scene(layout, 300, 250);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
