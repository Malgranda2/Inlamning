package classes;

import org.w3c.dom.Text;

import java.util.Scanner;

public class TextReader {

    public TextReader() {
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
