package AuthorList;

import java.util.ArrayList;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Authors {

	private String firstname, lastname;
	
	public Authors(String firstname, String lastname){
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstName(){
		return firstname;
	}
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	public String getLastName(){
		return lastname;
	}
	public void setLastName(String lastname){
		this.lastname = lastname;
	}
	public static ArrayList<TableColumn<Authors, ?>> getColumns(TableView table){
		int i;
		ArrayList<TableColumn<Authors, ?>> columns = new ArrayList<TableColumn<Authors,?>>();
		
		String[] columnNames = { "First Name", "Last Name" };
		String[] variableNames = { "firstname", "lastname" };
		Integer[] columnWidth = {33, 33};
		
		i = 0;
		TableColumn<Authors, String> firstCol = new TableColumn<>(columnNames[i++]);
		TableColumn<Authors, String> secondCol = new TableColumn<>(columnNames[i++]);
		
		i = 0;
		firstCol.prefWidthProperty().bind(table.widthProperty().divide(100 / columnWidth[i++]));
		secondCol.prefWidthProperty().bind(table.widthProperty().divide(100 / columnWidth[i++]));
		
		i = 0;
		firstCol.setCellValueFactory(new PropertyValueFactory<Authors, String>(variableNames[i++]));
		secondCol.setCellValueFactory(new PropertyValueFactory<Authors, String>(variableNames[i++]));
		
		columns.add(firstCol);
		columns.add(secondCol);
		
		return columns;
	}
}
