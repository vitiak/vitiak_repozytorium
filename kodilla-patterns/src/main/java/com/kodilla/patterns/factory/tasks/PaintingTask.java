package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    public String taskName;
    public String whatToPaint;
    public String color;
    boolean executed = false;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting interesting picture");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}

