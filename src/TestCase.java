import classes.TextAssessor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase {

    @Test
    public void testInput() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        String expected = "test";
        String actual = "";

        //Act
        actual = textAssessor.getLastWord();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void stopWhenWordIsStop() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        boolean expected = true;
        boolean actual = false;

        //Act
        textAssessor.addInput("Stop");
        actual = textAssessor.stop();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void letterCountOneWord() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        int expected = 4;
        int actual = -1;

        //Act
        actual = textAssessor.characterCount();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void lineCountOneline() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        int expected = 1;
        int actual = 0;

        //Act
        actual = textAssessor.lineCount();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void wordCountOneWord() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        int expected = 1;
        int actual = 0;

        //Act
        actual = textAssessor.wordCount();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void wordCountFiveWordsInTwoLines() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        int expected = 5;
        int actual = 0;

        //Act
        textAssessor.addInput("test av räknare split");
        actual = textAssessor.wordCount();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void findLongestWord() {
        //Arrange
        TextAssessor textAssessor = new TextAssessor("test");
        String expected = "nordvästersjökustartilleriflygspaningssimulatoranläggningsmaterielunderhållsuppföljningssystemdiskussionsinläggsförberedelsearbete";
        String actual = "";

        //Act
        textAssessor.addInput(expected);
        textAssessor.addInput("Sneaky Word");
        actual = textAssessor.getLongestWord();

        //Assert
        assertEquals(expected, actual);
    }
}
