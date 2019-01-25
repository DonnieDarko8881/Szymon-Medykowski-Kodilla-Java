package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void shouldReturnTrueBuyDressShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //While
        Task buyDress = factory.makeTask(TaskFactory.BUY_DRESS);
        buyDress.executeTask(true, true);
        Boolean ifTaskExecuted = buyDress.isTaskExecuted();
        String taskNameResult = buyDress.getTaskName();

        //Then
        Assert.assertEquals(true, ifTaskExecuted);
        Assert.assertEquals("BUY_DRESS", taskNameResult);
    }

    @Test
    public void shouldReturnFalseBuyBreadShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //While
        Task buyBread = factory.makeTask(TaskFactory.BUY_BREAD);
        buyBread.executeTask(false, true);
        Boolean ifTaskExecuted = buyBread.isTaskExecuted();
        String taskNameResult = buyBread.getTaskName();

        //Then
        Assert.assertEquals(false, ifTaskExecuted);
        Assert.assertEquals("BUY_BREAD", taskNameResult);
    }

    @Test
    public void shouldReturnTruePaintCatPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //While
        Task paintCat = factory.makeTask(TaskFactory.PAINT_PICTURE);
        paintCat.executeTask(true, true);
        Boolean ifTaskExecuted = paintCat.isTaskExecuted();
        String taskNameResult = paintCat.getTaskName();

        //Then
        Assert.assertEquals(true, ifTaskExecuted);
        Assert.assertEquals("Paint Cat", taskNameResult);
    }

    @Test
    public void shouldReturnTrueGo_Warsaw_By_TrainDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //While
        Task goWarsawByTrain = factory.makeTask(TaskFactory.GO_WARSAW_BY_TRAIN);
        goWarsawByTrain.executeTask(true, true);
        Boolean ifTaskExecuted = goWarsawByTrain.isTaskExecuted();
        String taskNameResult = goWarsawByTrain.getTaskName();

        //Then
        Assert.assertEquals(true, ifTaskExecuted);
        Assert.assertEquals("GO_WARSAW_BY_TRAIN", taskNameResult);
    }


}
