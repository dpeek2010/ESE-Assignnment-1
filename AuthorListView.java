package AuthorList;

import java.security.acl.Group;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AuthorListView extends ListView {

	public AuthorListView() {
		super();
		ListView<String> listView = new ListView<>();
	
		ObservableList<String> names = FXCollections.observableArrayList(
		          "Bob Vance", "Michael Scott", "Pam Halpert", "Creed Braton", 
		          "Michael Scarn");
		
		listView.setItems(names);
		listView.setOrientation(Orientation.VERTICAL);
		listView.setPrefSize(120, 100);

	}

}
