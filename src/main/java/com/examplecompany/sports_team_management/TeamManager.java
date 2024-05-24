package com.examplecompany.sports_team_management;



import java.util.HashSet;
import java.util.Set;

public class TeamManager {

	    private Set<Player> team;

	    public TeamManager() {
	        this.team = new HashSet<Player>();
	    }

	    public void addPlayer(Player player) {
	        team.add(player);
	    }

	    public void removePlayer(Player player) {
	        team.remove(player);
	    }

	    public boolean isPlayerInTeam(Player player) {
	        return team.contains(player);
	    }

	    public void displayAllPlayers() {
	        for (Player player : team) {
	            System.out.println(player);
	        }
	    }
	}

