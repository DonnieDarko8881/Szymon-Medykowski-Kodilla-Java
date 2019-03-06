package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void shouldReturnStringLogIsMade() {
        //Given
        //When
        Logger.getInstance().log("log is made");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log is made", result);
    }

    @Test
    public void shouldReturnLogCantBeNull() {
        try {
            Logger.getInstance().log(null);
        } catch (WrongContentException e) {
            String result = e.getMessage();
            Assert.assertEquals("Log cant be null", result);
        }
    }

    @Test
    public void shouldReturnStringLogIsMade1() {
        //Given
        //When
        Logger.getInstance().log("log is made");
        Logger.getInstance().log("log is made1");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log is made1", result);
    }
}
