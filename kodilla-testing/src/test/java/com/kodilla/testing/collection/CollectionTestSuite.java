package com.kodilla.testing.collection;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.matchers.JUnitMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testShouldReturnEmptyList() {
        //Given

        //When
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Testing " + numbers);
        List<Integer> result = exterminate(numbers);
        //Then
        Assert.assertThat(result.size(), CoreMatchers.equalTo(0));


    }

    @Test
    public void testShouldReturnFiveRecordList() {
        //Given

        //When
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("Testing " + numbers);
        List<Integer> result = exterminate(numbers);
        Integer[] even = new Integer[]{0,2,4,6,8};
        //Then

        //Assert.assertThat(result.size(), CoreMatchers.equalTo(5));
        Assert.assertArrayEquals(even, result.toArray());
    }
}
