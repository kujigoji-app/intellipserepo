package intellipse;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Intellipse extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		Button b = new Button("push");
		Label l = new Label("hello");
		root.getChildren().add(b);
		root.getChildren().add(l);
		b.addEventHandler(ActionEvent.ACTION, e -> l.setText("world"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
