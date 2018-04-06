package controllers;

import javafx.fxml.FXML;

public class TopMenuButtonsController {

	private static final String MAIN_MENU_FXML = "/fxml/mainMenu.fxml";

	private MainController mainController;

	private static final String STATISTICS_FXML = "/fxml/statistics.fxml";
	private static final String MUSTKNOW_FXML = "/fxml/mustKnow.fxml";
	private static final String BASICINFO_FXML = "/fxml/basicInfo.fxml";
	private static final String CURIOSITIES_FXML = "/fxml/curiosities.fxml";
	private static final String JOURNEYS_FXML = "/fxml/journeys.fxml";
	
	@FXML
	public void mainMenu() {
		mainController.setCenter(MAIN_MENU_FXML);

	}
	
	@FXML
	public void basicInfo() {
		mainController.setCenter(BASICINFO_FXML);

	}
	
	@FXML
	public void curiosities() {
		mainController.setCenter(CURIOSITIES_FXML);

	}
	
	@FXML
	public void mustKnow() {
		mainController.setCenter(MUSTKNOW_FXML);

	}
	
	@FXML
	public void journeys() {
		mainController.setCenter(JOURNEYS_FXML);

	}
	
	@FXML
	public void openStatistics() {
		mainController.setCenter(STATISTICS_FXML);

	}
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
}
