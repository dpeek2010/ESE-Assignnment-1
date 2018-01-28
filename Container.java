package AuthorList;

import AuthorDetail.AuthorDetailController;
import Authors.Authors;

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Container extends Application {
	
	//private ObservableList<Authors> authors;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//logger.info("calling start()");
		
		//generate a scenegraph from the fxml file
		//note that the entire view will be laid out in the fxml file
		Parent root = FXMLLoader.load(getClass().getResource("../container.fxml"));
		
		//AuthorListController listController = new AuthorListController(authors);
		AuthorDetailController detailController = new AuthorDetailController(new Authors("Creed", "Braton", "11/11/1911", "www.creed.com"));
		
		//build a scene with the scenegraph as its root node
		Scene scene = new Scene(root);

		primaryStage.setTitle("JavaFX SDI Application with Logging");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
