package application;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import model.Player;

public class PersonOverviewController{

	
    @FXML
    private TableView<Player> personTable;
    
    @FXML
    private TableColumn<Player, String> firstNameColumn;
    
    
    @FXML
    private Label nickNameLabel; 
    
    @FXML
    private Label eliminationsLabel; 

    @FXML
    private Label matchesPlayedLabel; 

    @FXML
    private Label timePlayedLabel; 

    @FXML
    private Label matchXPLabel; 

    @FXML
    private Label friendsXPLabel; 
    
    @FXML
    private Label accountLevelLabel; 
    
    @FXML
    private Label passLevelLabel; 

    @FXML
    private Label passPurchasedLabel;
    
    private Main main;
    
    public PersonOverviewController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	
        // Initialize the person table with the column.
//        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().getNicknameProperty());
    }


    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(Main main) {
        this.main = main;

        // Add observable list data to the table
        personTable.setItems(main.getPersonData());
    }

    
	
	
}
