package AuthorList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Authors.Authors;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

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
	//private static Logger logger = LogManager.getLogger();
	
	@FXML private ListView<Authors> authorList;
	private ObservableList<Authors> listData;
	
	
    public AuthorListController(ObservableList<Authors> author) {
    	listData = author;
    }
    
    @FXML void onAuthorListClicked(MouseEvent event) {
    	Authors author = authorList.getSelectionModel().getSelectedItem();
    	//if(author != null)
    		//logger.info(author.getFirstName() +" " + author.getLastName() + " was clicked");
    }
    
    @FXML void onAuthorDoubleClicked(MouseEvent event){
    	//pull up clicked authors details
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//logger.info("calling initialize()");

		
		authorList.setItems(listData);

	}
}
