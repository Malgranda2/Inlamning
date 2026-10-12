import classes.TextAssessor;
import classes.TextReader;

public class Main {

    static void main() {
        TextReader textReader = new TextReader();
        TextAssessor textAssessor = new TextAssessor();


        while (!textAssessor.stop()) {
            textAssessor.addInput(textReader.getInput());
        }

        System.out.println("User wrote:");
        System.out.println(textAssessor.lineCount() + " lines of text");
        System.out.println(textAssessor.characterCount() + " characters of text");
        System.out.println(textAssessor.wordCount() + " words");
        System.out.println(textAssessor.getLongestWord() + " was the longest word");

    }
}
