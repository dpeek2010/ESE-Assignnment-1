package AuthorDetail;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import Authors.Authors;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AuthorDetailController implements Initializable {
	//private static Logger logger = LogManager.getLogger();

	
	@FXML private TextField first;
	@FXML private TextField last;
	@FXML private TextField dateOfBirth;
	@FXML private TextField website;
	
	private Authors author;
	
	public AuthorDetailController(Authors author) {
		this.author = author;
	}

	@FXML void onSaveClicked(MouseEvent event){
		//Logger.info("calling onSaveClicked");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		first.textProperty().bindBidirectional(author.firstNameProperty());
		last.textProperty().bindBidirectional(author.lastNameProperty());
		dateOfBirth.textProperty().bindBidirectional(author.dateOfBirthProperty());
		website.textProperty().bindBidirectional(author.websiteProperty());
	}

}
