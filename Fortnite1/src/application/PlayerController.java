package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.MatchMaking;
import model.Player;
import model.Weapon;


public class PlayerController{
	
	Player player;
	MatchMaking matchMaking;
	
	@FXML
	public Player getPlayerClass(){
		return player;
	}
	
	@FXML
	public MatchMaking getMatchMakingClass(){
		return matchMaking;
	}
	
	@FXML
    void addWeapon(ActionEvent event) {
		//matchMaking.addPlayer("inck");
//		System.out.println(matchMaking.getPlayer().get(0).getNickname());
//		Player player1 = matchMaking.getPlayer().get(0);
//		player1.addWeapon(new Weapon("M4", 30, "", 2));
//		System.out.println(player1.getNickname());
		matchMaking.getPlayer().add(new Player("ashgaron", 1700, 1500, 2880, 120, 10, 328, 100, true));
		System.out.println(matchMaking.getPlayer().size());
    	//player.addWeapon(new Weapon("M4", 30, "", 2));
    	//System.out.println(player1.getWeapons().check().getName());
    }

}
