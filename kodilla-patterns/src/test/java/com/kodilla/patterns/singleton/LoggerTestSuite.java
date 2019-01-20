package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void shouldReturnStringLogIsMade(){
        //Given
        //When
        Logger.getInstance().log("log is made");
        String result= Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log is made", result);
    }
}
