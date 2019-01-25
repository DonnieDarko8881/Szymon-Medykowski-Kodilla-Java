package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean motivationToExecuteTask;
    private boolean timeToPaint;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask(Boolean timeToPaint, Boolean motivationToExecuteTask) {
        this.timeToPaint = timeToPaint;
        this.motivationToExecuteTask = motivationToExecuteTask;
        if (timeToPaint && motivationToExecuteTask) {
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
        boolean executeTask = executeTask(timeToPaint, motivationToExecuteTask);
        if (executeTask) {
            System.out.println("You have done :" + "\"" + getTaskName() + "\"");
            System.out.println("you have Painted " + color + " " + whatToPaint);
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
