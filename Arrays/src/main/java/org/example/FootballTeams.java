package org.example;
import java.util.Arrays;

public class FootballTeams {
    public static void main(String[] args) {
        int teamSize = 11;
        int team1[] = new int[teamSize];
        int team2[] = new int[teamSize];

        for (int i = 0; i < teamSize; i++) {
            team1[i] = 18 + (int) (Math.random() * 28);
            team2[i] = 18 + (int) (Math.random() * 28);

        }
        System.out.println("Команда 1: " + Arrays.toString(team1));
        System.out.println("Команда 2: " + Arrays.toString(team2));

        System.out.println("Середній вік першої команди: " );
        System.out.println("Середній вік другої команди: " );

        double avgAgeTeam1 = calculateAverageAge(team1);
        double avgAgeTeam2 = calculateAverageAge(team2);

        if (avgAgeTeam1 > avgAgeTeam2) {
            System.out.println("Команда 1 має вищий середній вік");
        } else if (avgAgeTeam1 < avgAgeTeam2) {
            System.out.println("Команда 2 має вищий середній вік");
        } else {
            System.out.println("Обидві команди мають однаковий середній вік");
        }

    }
    public static double calculateAverageAge(int[] team) {
        int totalAge = 0;
        for (int age : team) {
            totalAge += age;
        }
        return (double) totalAge / team.length;
    }
}