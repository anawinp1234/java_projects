package GolfersManagementSystemV4;

import java.io.Serializable;
import java.util.ArrayList;

public class Golfer implements Serializable {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Integer> getScores() {
        return scores;
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

    public void displayInfo(StringBuilder sb) {
        sb.append("Name: ").append(name).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("Scores: ").append(scores).append("\n");
        sb.append("Average Score: ").append(getAverageScore()).append("\n");
    }
}
