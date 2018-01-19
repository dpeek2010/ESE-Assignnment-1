package AuthorList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class AuthorListView extends AnchorPane{

	public AuthorListView() {
		super();
		
		TextField tf1 = new TextField();
		tf1.setText("anchored left and top");
		tf1.setPrefWidth(150);
		this.getChildren().addAll(tf1);
	}

}
