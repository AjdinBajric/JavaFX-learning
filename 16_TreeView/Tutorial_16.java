import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tutorial_16 extends Application {

	Stage window;
	TreeView<String> tree;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");

		TreeItem<String> root, fruit, vegetables;

		// Root
		root = new TreeItem<>();
		root.setExpanded(true);

		// Fruit
		fruit = makeBranch("Apple", root);
		makeBranch("Orange", fruit);
		makeBranch("Grapes", fruit);
		makeBranch("Peach", fruit);
		makeBranch("Pear", fruit);

		// Vegetables
		vegetables = makeBranch("Carrot", root);
		makeBranch("Potato", vegetables);
		makeBranch("Cucumber", vegetables);
		makeBranch("Lettuce", vegetables);
		makeBranch("Tomato", vegetables);

		// Create tree
		tree = new TreeView<String>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {

			if (newValue != null)
				System.out.println(newValue.getValue());

		});

		// Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

}