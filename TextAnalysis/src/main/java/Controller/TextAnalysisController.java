package Controller;

import Model.TextAnalysisModel;
import View.TextAnalysisView;

public class TextAnalysisController {

    // Instans av Model och View
    private final TextAnalysisModel model;
    private final TextAnalysisView view;

    // Konstruktor för att initiera Model och View
    public TextAnalysisController(TextAnalysisModel model, TextAnalysisView view) {
        this.model = model;
        this.view = view;
    }

    // Metod för att räkna antal ord
    public int getWordCount(String text) {
        return model.countWords(text);
    }

    // Metod för att räkna antal bokstäver
    public int getLetterCount(String text) {
        return model.countLetters(text);
    }

    // Metod för att räkna antal meningar
    public int getSentenceCount(String text) {
        return model.countSentences(text);
    }

}
