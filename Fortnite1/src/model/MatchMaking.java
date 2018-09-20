package model;

import java.util.ArrayList;

public class MatchMaking {

	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void MatchMaking(){ 
	}
	
	public ArrayList<Character> ranking(){
		int n = players.size();
		ArrayList<Character> ranking = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			int eliminations = players.get(i).getElimintations();
			int matchesPlayed = players.get(i).getMatchesPlayed();
			int timePlayed = players.get(i).getTimePlayed();
			int seasonLevel = players.get(i).getPassLevel();
			int accountLevel = players.get(i).getAccountLevel();
			double rank = ((((eliminations/matchesPlayed)+(timePlayed/seasonLevel))*(accountLevel-seasonLevel))/100);
			char category = ranking.get(i);
			if(rank >= 0 && rank <12.5){
				category = 'A';
			}else if(rank >= 12.5 && rank <25){
				category = 'B';
			}else if (rank>= 25 && rank < 37.5){
				category = 'C';
			}else if(rank >= 37.5 && rank <50){
				category = 'D';
			}else if (rank >= 50 && rank < 62.5){
				category = 'E';
			}else if (rank >= 62.5 && rank < 75){
				category = 'F';
			}else if (rank >= 75 && rank < 87.5){
				category = 'G';
			}else if (rank >= 87.5 && rank < 100){
				category = 'H';
			}else{
				category = 'I';
			}
			
		}
		return ranking;
	}
	
	public ArrayList<Player> addPlayer(String nick){
		
		for (int i = 0; i < players.size() && nick != players.get(i).getNickname(); i++) {
			if (players.get(i) == null) {
				players.add(players.get(i));
			}
		}
		return players;
		
	}
}
