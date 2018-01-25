package AuthorList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AuthorListController implements Initializable{
	@FXML private ListView<Authors> authorList;

    private ObservableList<Authors> author;
    
    public AuthorListController(ObservableList<Authors> author) {
    	this.author= author;
    	
    }
    
    @FXML void onAuthorListClicked(MouseEvent event) {
    	/*try {

    		Authors author = authorList.getSelectionModel().getSelectedItem();
    		if(author != null) {
    			//display detail of clicked dog
    			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DogDetailView.fxml"));
    			loader.setController(new AuthorDetailController(dog));
    			GridPane rootPane = loader.load();
    			Scene scene = new Scene(rootPane, 400, 200);
    			Stage stage = new Stage();
    			stage.setScene(scene);
    			stage.setTitle("Detail View for " + dog.getDogName());
    			stage.show();
    			
    			logger.info(dog.getDogName() + " clicked");
    		}
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}*/
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.authorList.setItems(author);

	}
}
