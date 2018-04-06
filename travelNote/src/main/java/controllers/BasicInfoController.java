package controllers;

import fxmlUtils.ApplicationException;
import general.Director;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BasicInfoController {

	private Director director = new Director();
	
	private String IDName;
	
	@FXML
	private TextField textFieldCountry;
	
	@FXML
	private TextField textFieldLanguage;
	
	@FXML
	private TextField textFieldCapital;
	
	@FXML
	private TextField textFieldCurrency;
	
	@FXML
	private TextField textFieldContinent;
	
	@FXML
	private TextField textFieldReligion;

	@FXML
	private TextField textFieldNeighbours;
	
	@FXML
	public void initialize(){

		setFields();
	}
	

	public void setFields() {
		
		textFieldCapital.setText(director.getThailand().getBasicInfo().getCapital());
		textFieldLanguage.setText(director.getThailand().getBasicInfo().getLanguage());
		textFieldContinent.setText(director.getThailand().getBasicInfo().getContinent());
		textFieldCountry.setText(director.getThailand().getBasicInfo().getCountry());
		textFieldCurrency.setText(director.getThailand().getBasicInfo().getCurrency());
		textFieldNeighbours.setText(director.getThailand().getBasicInfo().getNeighbours());
		textFieldReligion.setText(director.getThailand().getBasicInfo().getReligion());	
	}
	
	
	
	  
	  
}
