package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals(false, driving.isTaskExecuted());
        Assert.assertEquals("Driving ", driving.getTaskName());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(false, shopping.isTaskExecuted());
        Assert.assertEquals("Shopping ", shopping.getTaskName());
    }
}
