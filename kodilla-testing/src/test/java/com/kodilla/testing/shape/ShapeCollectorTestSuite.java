package com.kodilla.testing.shape;
import org.junit.*;
import com.kodilla.testing.shape.Shape.*;
import com.kodilla.testing.shape.ShapeCollector;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Shape();

        //When
        shape.addFigure("Circle");

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

}
