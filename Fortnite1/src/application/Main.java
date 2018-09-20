package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import model.Player;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private ObservableList<Player> personData = FXCollections.observableArrayList();
	

	
//	public Main(){
//		personData.add(new Player("Ashgaron", 1700, 1500, 48, 1.20, .40, 328, 100, true));
//
//	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = FXMLLoader.load(getClass().getResource("InterfazFortnite.fxml"));
			Scene scene = new Scene(root,660,420);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		
		}
	}
    
	public ObservableList<Player> getPersonData() {
        return personData;
    }
	public static void main(String[] args) {
		launch(args);
	
	}
}
