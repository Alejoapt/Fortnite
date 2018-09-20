package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InterfazFortniteController {
	
	@FXML
    void openPlayInterfaz(ActionEvent event) throws IOException {
    	Parent view = FXMLLoader.load(getClass().getResource("PlayInterfaz.fxml"));
    	Scene viewScene = new Scene(view);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(viewScene);
    	window.show();
    	
    }
    
	@FXML
//	private Label nickName;
//	private Label eliminations;
//	private Label matchesPlayed;
//	private Label timePlayed;
//	private Label matchXP;
//	private Label friendsXP;
//	private Label accountLevel;
//	private Label passLevel;
//	private Label seassonLevel;
//	private Label platform;
//	private Label theNickName;
//	private Label theEliminations;
//	private Label theMatchesPlayed;
//	private Label theTimePlayed;
//	private Label theMatchXP;
//	private Label theFriendsXP;
//	private Label theAccountLevel;
//	private Label thePassLevel;
//	private Label theSeassonLevel;
//	private Label thePlatform;
//	
//	@FXML
//	private GridPane grid;
//	
//	
//	public void initialize(){
//		nickName = new Label("Nickname");
//		theNickName = new Label();
//		eliminations = new Label("Eliminations");
//		theEliminations = new Label();
//		matchesPlayed = new Label("MatchesPlayed");
//		theMatchesPlayed = new Label();
//		timePlayed = new Label("timePlayed");
//		theTimePlayed = new Label();
//		matchXP = new Label("MatchXP");
//		theMatchXP = new Label();
//		friendsXP = new Label("FriendsXP");
//		theFriendsXP = new Label();
//		accountLevel = new Label("accountLevel");
//		theAccountLevel = new Label();
//		passLevel = new Label("passLevel");
//		thePassLevel = new Label();
//		seassonLevel = new Label("seassonLevel");
//		theSeassonLevel = new Label();
//		platform = new Label("Platform");
//		thePlatform = new Label();
//		grid.add(nickName, 0, 0);
//		grid.add(theNickName, 1, 0);
//		grid.add(eliminations, 0, 1);
//		grid.add(theEliminations, 1, 1);
//		grid.add(matchesPlayed, 0, 2);
//		grid.add(theMatchesPlayed, 1, 2);
//		grid.add(timePlayed, 0, 3);
//		grid.add(theTimePlayed, 1, 3);
//		grid.add(matchXP, 0, 4);
//		grid.add(theMatchXP, 1, 4);
//		grid.add(friendsXP, 0, 5);
//		grid.add(theFriendsXP, 1, 5);
//		grid.add(accountLevel, 0, 6);
//		grid.add(theAccountLevel, 1, 6);
//		grid.add(passLevel, 0, 7);
//		grid.add(thePassLevel, 1, 7);
//		grid.add(seassonLevel, 0, 8);
//		grid.add(theSeassonLevel, 1, 8);
//		grid.add(platform, 0, 9);
//		//grid.add(thePassLevel, 1, 9);
//	}
	
	public void setNickName(Label nickName) {
//		this.nickName = "Hola";
	}
	
	
	
    
    
    
    
	

}
