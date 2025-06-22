package GolfersManagementSystemV2;

import java.util.ArrayList;

public class Golfer {
    private String name;
    private int age;
    private ArrayList<Integer> scores;

    public Golfer(String name, int age) {
        this.name = name;
        this.age = age;
        this.scores = new ArrayList<>();
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public double getAverageScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Scores: " + scores);
        System.out.println("Average Score: " + getAverageScore());
    }
}
