package com.kodilla.stream.beautifer;

import com.kodilla.stream.beautifier.PoemBeautifier;
import org.junit.*;

public class PoemBeautifierTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void returnUpperText() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        final String textToDecorate = " text to decorate";

        //When
        String upperText = poemBeautifier.beautify(textToDecorate, String::toUpperCase);
        String expectedText = " TEXT TO DECORATE";

        //Then
        Assert.assertEquals(expectedText, upperText);
    }

    @Test
    public void returnHashTagText() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        final String textToDecorate = " text to decorate";

        //When
        String hasTagText = poemBeautifier.beautify(textToDecorate, addHashTag -> addHashTag.replaceAll(" ", "#"));
        String expectedText = "#text#to#decorate";

        //Then
        Assert.assertEquals(expectedText, hasTagText);
    }

    @Test
    public void returnTextWithEND() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        final String textToDecorate = " text to decorate";

        //When
        String addEND = poemBeautifier.beautify(textToDecorate, addEnd -> addEnd.concat(" END"));
        String expectedText = " text to decorate END";

        //Then
        Assert.assertEquals(expectedText, addEND);
    }

    @Test
    public void returnTextWithSTART() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        final String textToDecorate = " text to decorate";

        //When
        String addSTART = poemBeautifier.beautify(textToDecorate, addStart -> addStart.replaceFirst(" ", "START "));
        String expectedText = "START text to decorate";

        //Then
        Assert.assertEquals(expectedText, addSTART);
    }

    @Test
    public void returnTextWithOutSpace() {

        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        final String textToDecorate = " text to decorate";

        //When
        String removeSpace = poemBeautifier.beautify(textToDecorate, withOutSpace -> withOutSpace.replaceAll(" ", ""));
        String expectedText = "texttodecorate";

        //Then
        Assert.assertEquals(expectedText, removeSpace);
    }
}
