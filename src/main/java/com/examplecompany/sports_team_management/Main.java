package com.examplecompany.sports_team_management;

import java.util.Scanner;

import com.examplecompany.sports_team_management.TeamManager;

public class Main {
    public static void main(String[] args) {
    	 // Create TeamManager instance
        TeamManager teamManager = new TeamManager();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Display all players");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter player name to add:");
                    String playerNameToAdd = scanner.nextLine();
                    Player playerToAdd = new Player(playerNameToAdd);
                    teamManager.addPlayer(playerToAdd);
                    System.out.println(playerNameToAdd + " added to the team.");
                    break;
                case 2:
                    System.out.println("Enter player name to remove:");
                    String playerNameToRemove = scanner.nextLine();
                    Player playerToRemove = new Player(playerNameToRemove);
                    if (teamManager.isPlayerInTeam(playerToRemove)) {
                        teamManager.removePlayer(playerToRemove);
                        System.out.println(playerNameToRemove + " removed from the team.");
                    } else {
                        System.out.println(playerNameToRemove + " is not in the team.");
                    }
                    break;
                case 3:
                    System.out.println("All players in the team:");
                    teamManager.displayAllPlayers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}