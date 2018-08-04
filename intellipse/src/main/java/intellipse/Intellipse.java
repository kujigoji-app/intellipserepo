package intellipse;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.SegmentedButton;

public class Intellipse extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		Button b = new Button("push");
		Label l = new Label("hello");
		SegmentedButton sb = new SegmentedButton();
		sb.getButtons().addAll(new ToggleButton("a"),new ToggleButton("b"));
		root.getChildren().add(b);
		root.getChildren().add(l);
		root.getChildren().add(sb);
		sb.getToggleGroup().selectedToggleProperty().addListener((obs,o,n)->l.setText(((ToggleButton) n).getText()));
		b.addEventHandler(ActionEvent.ACTION, e -> l.setText("world"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
