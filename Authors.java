package Authors;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Authors {

	private SimpleStringProperty firstname;
	private SimpleStringProperty lastname;
	private SimpleStringProperty dateOfBirth;
	private SimpleStringProperty website;
	
	public Authors() {
		firstname = new SimpleStringProperty();
		lastname = new SimpleStringProperty();
		dateOfBirth = new SimpleStringProperty();
		website = new SimpleStringProperty();
	}
	
	public Authors(String firstname, String lastname, String dateOfBirth, String website){
		this();
		this.firstname.set(firstname);
		this.lastname.set(lastname);
		this.dateOfBirth.set(dateOfBirth);
		this.website.set(website);
	}
	
	public String getFirstName(){
		return firstname.get();
	}
	public void setFirstName(String firstname){
		this.firstname.set(firstname);
	}
	public String getLastName(){
		return lastname.get();
	}
	public void setLastName(String lastname){
		this.lastname.set(lastname);
	}
	public String getDateOfBirth(){
		return dateOfBirth.get();
	}
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth.set(dateOfBirth);
	}
	public String getWebsite(){
		return website.get();
	}
	public void setWebsite(String website){
		this.website.set(website);
	}
	public SimpleStringProperty firstNameProperty() {
		return firstname;
	}
	public SimpleStringProperty lastNameProperty() {
		return lastname;
	}
	public SimpleStringProperty dateOfBirthProperty(){
		return dateOfBirth;
	}
	public SimpleStringProperty websiteProperty(){
		return website;
	}
	
}
