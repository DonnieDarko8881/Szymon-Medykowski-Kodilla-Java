package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean motivationToExecuteTask;
    private boolean enoughMoney;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask(Boolean enoughMoney, Boolean motivationToExecuteTask) {
        this.enoughMoney = enoughMoney;
        this.motivationToExecuteTask = motivationToExecuteTask;
        if (enoughMoney && motivationToExecuteTask) {
            return true;
        } else
            return false;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean executeTask = executeTask(enoughMoney, motivationToExecuteTask);
        if (executeTask) {
            System.out.println("You have done :" + "\"" + getTaskName() + "\"");
            System.out.println("you have driven to " + where + " by " + using);
            return true;
        } else {
            infoNotExecuted();
            return false;
        }
    }

    public void infoNotExecuted() {
        System.out.println("You haven't done " + getTaskName() + " yet");
        System.out.println("You haven't motivation or money to execute this task");
    }
}
