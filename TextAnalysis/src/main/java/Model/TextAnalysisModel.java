package Model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextAnalysisModel {

    // Metod för att räkna ord
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }

    // Metod för att räkna bokstäver
    public int countLetters(String text) {
        if (text == null || text.isEmpty()) return 0;
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) count++;
        }
        return count;
    }

    // Metod för att räkna meningar
    public int countSentences(String text) {
        if (text == null || text.isEmpty()) return 0;
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') count++;
        }
        return count;
    }
}
