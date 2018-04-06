package controllers;

import java.sql.SQLException;

import database.Country;
import database.DataBaseDirector;
import fxmlUtils.ApplicationException;
import general.Director;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class mainMenuController {

	private DataBaseDirector director = new DataBaseDirector();
	
	public DataBaseDirector getDirector() {
		return director;
	}

	public void setDirector(DataBaseDirector director) {
		this.director = director;
	}
	@FXML
	private TableView <Country> TableViewCountry; 
	
	@FXML
	private TableColumn <Country, String> TableColumnId; 
	
	@FXML
	private TableColumn  <Country, String>  TableColumnName; 

	@FXML
	public void initialize() {
		
		TableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		TableViewCountry.setItems(director.getcountryList());
		
		
	}

	@FXML
	public void addTrip() throws ApplicationException {
	
		director.saveCountryInDataBase("trolotr");
		

	
	}

	@FXML
	public void editTrip() {
		System.out.println("dada");
	}
	 int i=0;
	@FXML
	public void deleteTrip() {
		 try {

	            this.director.deleteCountryById(i);
	     i++;  
		 } catch (ApplicationException | SQLException e) {
	            System.out.println("zle");
	        }
	}

}
