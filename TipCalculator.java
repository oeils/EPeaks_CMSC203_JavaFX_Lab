package abc;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class TipCalculator extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10);
		
		Label chargeLabel = new Label("Restaurant Charge:");
		TextField chargeField = new TextField();

		Button calculateButton = new Button("Calculate Tip");

		Label tipLabel = new Label("Amount to Tip:");
		Label tipAmountLabel = new Label("");
		
		root.getChildren().addAll(chargeLabel, chargeField, calculateButton, tipLabel, tipAmountLabel);

		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10));
		
		calculateButton.setOnAction(event -> {
		    double charge = Double.parseDouble(chargeField.getText());
		    double tip = charge * 0.20;
		    tipAmountLabel.setText(String.format("$%.2f", tip));
		});

		
		Scene scene = new Scene(root, 350, 250);
		
		primaryStage.setTitle("Tip Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}