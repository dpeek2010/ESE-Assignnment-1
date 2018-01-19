package AuthorList;

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//generate a scenegraph from the fxml file
		//note that the entire view will be laid out in the fxml file
		Parent root = FXMLLoader.load(getClass().getResource("../proj1fxml.fxml"));
		//build a scene with the scenegraph as its root node
		Scene scene = new Scene(root);

		primaryStage.setTitle("Proj1 Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	/*@Override
	public void stop() throws Exception {
		super.stop();
	}*/
}
