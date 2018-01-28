package AuthorList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MenuController2 implements Initializable{
	@FXML private MenuBar menuBar;
	@FXML private MenuItem menuItemExit;
	@FXML private MenuItem menuAuthorDetailView;
	@FXML private MenuItem menuAuthorListView;
	@FXML private BorderPane rootPane;
	
	@FXML private void handleMenuAction(ActionEvent event) throws IOException {
		//ViewSwitcher view = new ViewSwitcher();
		if(event.getSource() == menuAuthorListView) {
			Parent pane = new AuthorListView();
			rootPane.setCenter(pane);
		}else if (event.getSource() == menuAuthorDetailView){
			Parent pane = FXMLLoader.load(getClass().getResource("AuthorDetailView.fxml"));
			rootPane.setCenter(pane);
			//rootPane.setCenter(new AuthorDetailView());
		} else if(event.getSource() == menuItemExit) {
			System.exit(0);
		} 
	}


		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		menuBar.setFocusTraversable(true);
	}

}
