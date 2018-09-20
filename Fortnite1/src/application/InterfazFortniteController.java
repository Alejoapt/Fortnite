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
	Label nickName;
	
	public void setNickName(Label nickName) {
//		this.nickName = "Hola";
	}
	
	
	
    
    
    
    
	

}
