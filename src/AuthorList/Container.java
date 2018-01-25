package AuthorList;

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Container extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//generate a scenegraph from the fxml file
		//note that the entire view will be laid out in the fxml file
		Parent root = FXMLLoader.load(getClass().getResource("../container.fxml"));
		//build a scene with the scenegraph as its root node
		Scene scene = new Scene(root);

		primaryStage.setTitle("JavaFX SDI Application with Logging");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
