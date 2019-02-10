package com.kodilla.patterns.factory.tasks;

public interface Task {


    boolean executeTask(Boolean enoughMoneyOrTime, Boolean motivationToExecuteTask);

    String getTaskName();

    boolean isTaskExecuted();

}
