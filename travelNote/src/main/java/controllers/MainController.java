package controllers;

import fxmlUtils.FxmlUtils;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainController {

	@FXML
	private BorderPane borderPane;

	@FXML
	private TopMenuButtonsController topMenuButtonsController;

	@FXML
	private void initialize() {

		topMenuButtonsController.setMainController(this);
		setCenter("/fxml/mainMenu.fxml");
	}

	public void setCenter(String fxmlPath) {

		borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
	}

}
