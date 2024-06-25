

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        String homeTeam;
        String visitingTeam;
        int homeTeamPoints;
        int visitingTeamPoints;
        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();

                String[] parts = data.split(",");

                homeTeam = parts[0];
                visitingTeam = parts[1];
                homeTeamPoints = Integer.parseInt(parts[2]);
                visitingTeamPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                }

                if (homeTeam.equals(team) && homeTeamPoints > visitingTeamPoints) {
                    wins++;
                } else if (homeTeam.equals(team) && homeTeamPoints < visitingTeamPoints){
                    losses++;
                } else if (visitingTeam.equals(team) && visitingTeamPoints > homeTeamPoints){
                    wins++;
                } else if (visitingTeam.equals(team) && visitingTeamPoints < homeTeamPoints) {
                    losses++;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);





    }

}
