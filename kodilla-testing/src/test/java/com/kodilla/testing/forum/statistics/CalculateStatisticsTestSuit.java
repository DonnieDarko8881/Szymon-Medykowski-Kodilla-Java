package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuit {

    private static int testCounter;

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

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void return1000Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            users.add("Adam");
        }

        when(statisticsMock.usersNames()).thenReturn(users);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberUsers = CalculateStatistics.getNumberUsers(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(1000, numberUsers);
    }

    @Test
    public void return0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberUsers = CalculateStatistics.getNumberUsers(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(0, numberUsers);
    }


    @Test
    public void return1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;

        when(statisticsMock.postsCount()).thenReturn(posts);


        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberPosts = CalculateStatistics.getNumberPosts(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(1000, numberPosts);
    }

    @Test
    public void return0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 0;

        when(statisticsMock.postsCount()).thenReturn(posts);
        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberPosts = CalculateStatistics.getNumberPosts(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(0, numberPosts);
    }

    @Test
    public void return0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;

        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberComments = CalculateStatistics.getNumberComments(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(0, numberComments);
    }

    @Test
    public void return200Posts100Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 200;
        int comments = 100;

        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberComments = CalculateStatistics.getNumberComments(statisticsMock);
        int numberPosts = CalculateStatistics.getNumberPosts(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(100, numberComments);
        Assert.assertEquals(200, numberPosts);
    }

    @Test
    public void return200Comments100Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 100;
        int comments = 200;

        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberComments = CalculateStatistics.getNumberComments(statisticsMock);
        int numberPosts = CalculateStatistics.getNumberPosts(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(200, numberComments);
        Assert.assertEquals(100, numberPosts);
    }

    @Test
    public void returnAvrNumberPost33PerUser100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 33;

        List<String> users = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            users.add("Adam");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(users);

        CalculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double avrNumberPostsPerUser = CalculateStatistics.getAvrNumberPostsPerUser(statisticsMock);
        System.out.println(CalculateStatistics.showStatistics(statisticsMock));

        //Then
        Assert.assertEquals(0.33, avrNumberPostsPerUser,0.0);

    }
}
