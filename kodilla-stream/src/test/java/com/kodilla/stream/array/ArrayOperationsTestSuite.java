package com.kodilla.stream.array;

import org.junit.*;

public class ArrayOperationsTestSuite {

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
    public void returnAverageOfArray4() {

        //Given
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 2;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4, average, 0.0);

    }

}
