package edu.orangecoastcollege.cs272.ic13.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.cs272.ic13.controller.Controller;
import edu.orangecoastcollege.cs272.ic13.model.VideoGame;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ViewInventoryScene implements Initializable {

	private static Controller controller = Controller.getInstance();

	@FXML
	private ListView<VideoGame> userVideoGamesLV;
	@FXML
	private Label userLabel;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    userVideoGamesLV.setItems(controller.getGamesForCurrentUser());
	    userLabel.setText(controller.getCurrentUser().getName());
	}


	@FXML
	public Object backToAllGames()
	{
        ViewNavigator.loadScene("Video Game List", ViewNavigator.VIDEO_GAME_LIST_SCENE);
	    return this;
	}
}
