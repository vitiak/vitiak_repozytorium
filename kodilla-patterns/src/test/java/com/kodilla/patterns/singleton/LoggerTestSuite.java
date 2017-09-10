package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
        Logger.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        Logger.getInstance().close();
    }

    @Test
    public void testLog() {
        //Given
        //When
//        Logger logger = new Logger();
        Logger.getInstance().log("This is log");
        String logName = Logger.getInstance().getLastLog();
        //System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("This is log", logName);
    }
}
