import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tutorial_18 extends Application {

	Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantity;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("thenewboston - JavaFX");

		// Name column
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

		// Price column
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

		// Quantity column
		TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

		// Name input
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);

		// Price input

		priceInput = new TextField();
		priceInput.setPromptText("Price");
		priceInput.setMinWidth(100);

		// Quantity input
		quantity = new TextField();
		quantity.setPromptText("Quantity");
		quantity.setMinWidth(100);

		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e -> deleteButtonClicked());

		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput, priceInput, quantity, addButton, deleteButton);

		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(table, hBox);

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}

	// Get all of the products
	public ObservableList<Product> getProduct() {
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 859.00, 20));
		products.add(new Product("Mouse", 2.49, 198));
		products.add(new Product("Keyboard", 99.00, 74));
		products.add(new Product("Speakers", 19.99, 12));
		products.add(new Product("Microphone", 1.49, 856));
		return products;
	}

	// Add Button clicked

	public void addButtonClicked() {

		Product product = new Product();

		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantity.getText()));

		table.getItems().add(product);

		nameInput.clear();
		priceInput.clear();
		quantity.clear();
	}

	// Delete button clicked

	public void deleteButtonClicked() {

		ObservableList<Product> productsSelected, allProducts;
		allProducts = table.getItems();
		productsSelected = table.getSelectionModel().getSelectedItems();

		for (Product p : productsSelected)
			allProducts.remove(p);

	}

}