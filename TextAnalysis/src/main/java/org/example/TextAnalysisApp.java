package org.example;

import Controller.TextAnalysisController;
import Model.TextAnalysisModel;
import View.TextAnalysisView;

public class TextAnalysisApp {
    public static void main(String[] args) {
        // Skapa Model och Controller
        TextAnalysisModel model = new TextAnalysisModel();
        TextAnalysisView view = new TextAnalysisView();
        TextAnalysisController controller = new TextAnalysisController(model, view);

        // Kör applikationen
        view.createView(controller);
    }
}
