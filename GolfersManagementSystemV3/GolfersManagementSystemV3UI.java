package GolfersManagementSystemV3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GolfersManagementSystemV3UI {
    private static ArrayList<Golfer> golfers = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Golfers Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2, 10, 10));

            JTextField nameField = new JTextField();
            JTextField ageField = new JTextField();
            JTextField handicapField = new JTextField();
            JTextField sponsorField = new JTextField();
            JTextField numScoresField = new JTextField();
            JTextField scoreField = new JTextField();

            panel.add(new JLabel("              Name:"));
            panel.add(nameField);
            panel.add(new JLabel("              Age:"));
            panel.add(ageField);
            panel.add(new JLabel("              Handicap (for Amateur only):"));
            panel.add(handicapField);
            panel.add(new JLabel("              Sponsor (for Professional only):"));
            panel.add(sponsorField);
            panel.add(new JLabel("              Number of Rounds:"));
            panel.add(numScoresField);
            panel.add(new JLabel("              Score:"));
            panel.add(scoreField);

            JButton addButton = new JButton("Add Golfer");
            JButton displayButton = new JButton("Display Golfers");

            JTextArea displayArea = new JTextArea();
            displayArea.setEditable(false);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String name = nameField.getText();
                        int age = Integer.parseInt(ageField.getText());
                        int numScores = Integer.parseInt(numScoresField.getText());

                        if (name.isEmpty() || age <= 0 || numScores <= 0) {
                            JOptionPane.showMessageDialog(frame, "Please enter valid details.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        if (!handicapField.getText().isEmpty() && !sponsorField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Please enter details for either Amateur or Professional, not both.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        Golfer golfer;
                        if (!handicapField.getText().isEmpty()) {
                            int handicap = Integer.parseInt(handicapField.getText());
                            golfer = new AmateurGolfer(name, age, handicap);
                        } else if (!sponsorField.getText().isEmpty()) {
                            String sponsor = sponsorField.getText();
                            golfer = new ProfessionalGolfer(name, age, sponsor);
                        } else {
                            JOptionPane.showMessageDialog(frame, "Please specify whether the golfer is an Amateur or Professional.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        for (int i = 0; i < numScores; i++) {
                            String scoreText = JOptionPane.showInputDialog(frame, "Enter score " + (i + 1) + ":");
                            if (scoreText != null) {
                                int score = Integer.parseInt(scoreText);
                                golfer.addScore(score);
                            }
                        }

                        golfers.add(golfer);
                        nameField.setText("");
                        ageField.setText("");
                        handicapField.setText("");
                        sponsorField.setText("");
                        numScoresField.setText("");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values where required.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            displayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuilder sb = new StringBuilder();
                    for (Golfer golfer : golfers) {
                        sb.append("Name: ").append(golfer.getClass().getSimpleName()).append("\n");
                        golfer.displayInfo();
                        sb.append("\n");
                    }
                    displayArea.setText(sb.toString());
                }
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(addButton);
            buttonPanel.add(displayButton);

            frame.add(panel, BorderLayout.NORTH);
            frame.add(buttonPanel, BorderLayout.CENTER);
            frame.add(new JScrollPane(displayArea), BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
