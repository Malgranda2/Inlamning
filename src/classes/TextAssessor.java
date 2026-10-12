package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class TextAssessor {
    boolean stop;
    ArrayList <String> inputs = new ArrayList<>();

    public TextAssessor() {
        stop = false;
    }

    public TextAssessor(String testString) {
        stop = false;
        inputs.add(testString);
    }

    public boolean stop() {
        return stop;
    }

    public void addInput(String input) {

        if (input.equalsIgnoreCase("stop")) {
            stop = true;
            return;
        }
        inputs.add(input);
    }

    public String getLastWord() {
        return inputs.getLast();
    }

    public int characterCount() {
        int amountOfLetters = 0;

        for(String line : inputs) {
            amountOfLetters += line.length();
        }
        return amountOfLetters;
    }

    public int lineCount() {
        return inputs.size();
    }

    public int wordCount() {
        ArrayList <String> wordBuffer = new ArrayList<String>();

        wordBuffer = getAllWords();

        return wordBuffer.size();

    }

    public String getLongestWord() {
        String longestWord = "";
        ArrayList <String> wordBuffer = new ArrayList<String>();

        wordBuffer = getAllWords();

        for (String word : wordBuffer) {
            if(longestWord.length() < word.length())
                longestWord = word;
        }
        return longestWord;
    }

    private ArrayList<String> getAllWords() {
        ArrayList <String> wordBuffer = new ArrayList<String>();
        for (String line : inputs) {
            line = line.trim();
            wordBuffer.addAll(Arrays.asList(line.split("\\s")));
        }

        return wordBuffer;
    }
}
