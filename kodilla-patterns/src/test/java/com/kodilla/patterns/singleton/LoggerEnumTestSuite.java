package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerEnumTestSuite {

    @Test
    public void shouldReturnStringLogIsMade() {
        //Given
        //When
        LoggerEnum.INSTANCE.log("log is made");
        String result = LoggerEnum.INSTANCE.getLastLog();
        //Then
        Assert.assertEquals("log is made", result);
    }

    @Test
    public void shouldReturnLogCantBeNull() {
        try {
            LoggerEnum.INSTANCE.log(null);
        } catch (WrongContentException e) {
            String result = e.getMessage();
            Assert.assertEquals("Log cant be null", result);
        }
    }
}