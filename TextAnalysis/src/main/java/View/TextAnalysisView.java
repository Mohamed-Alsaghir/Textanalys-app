package View;

import Controller.TextAnalysisController;

import javax.swing.*;
import java.awt.*;

public class TextAnalysisView {

    public void createView(TextAnalysisController controller) {
        // Skapa huvudfönstret
        JFrame frame = new JFrame("Textanalys");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        // Skapa GUI-komponenter
        JTextArea textArea = new JTextArea("Skriv din text här...");
        JButton wordButton = new JButton("Visa antal ord");
        JButton letterButton = new JButton("Visa antal bokstäver");
        JButton sentenceButton = new JButton("Visa antal meningar");
        JLabel resultLabel = new JLabel("Resultat visas här");

        // Lägg till komponenter i fönstret
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(wordButton);
        buttonPanel.add(letterButton);
        buttonPanel.add(sentenceButton);

        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(resultLabel, BorderLayout.NORTH);

        // Funktionalitet för knappar
        wordButton.addActionListener(e -> {
            String text = textArea.getText();
            int wordCount = controller.getWordCount(text);
            resultLabel.setText("Antal ord: " + wordCount);
        });

        letterButton.addActionListener(e -> {
            String text = textArea.getText();
            int letterCount = controller.getLetterCount(text);
            resultLabel.setText("Antal bokstäver: " + letterCount);
        });

        sentenceButton.addActionListener(e -> {
            String text = textArea.getText();
            int sentenceCount = controller.getSentenceCount(text);
            resultLabel.setText("Antal meningar: " + sentenceCount);
        });


        // Visa fönstret
        frame.setVisible(true);
    }


}
