package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean enoughMoney;
    private boolean motivationToExecuteTask;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
            System.out.println("you have bought " + quantity + " " + whatToBuy);
            return true;
        } else {
            infoNotExecuted();
            return false;
        }
    }

    private void infoNotExecuted() {
        System.out.println("You haven't done " + getTaskName() + " yet");
        System.out.println("You haven't motivation or money to execute this task");
    }
}
