package com.kodilla.testing.shape;
import org.junit.*;
import com.kodilla.testing.shape.Shape.*;
import com.kodilla.testing.shape.ShapeCollector.*;

import static com.kodilla.testing.shape.ShapeCollector.*;

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
        Circle shape = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.removeFigure(shape);
        shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(1, shapeCollector.getFigureQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square shape1 = new Square();
        Circle shape2 = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        boolean result = shapeCollector.removeFigure(shape1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapeCollector.shapeList.size());
        Assert.assertEquals("Circle", shapeCollector.getShapeName(shape2));

    }

    @Test
    public void testGetFigure() {
        //Given
        Square shape1 = new Square();
        Circle shape2 = new Circle();
        Triangle shape3 = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);

        //Then
        Assert.assertEquals( shape3, shapeCollector.getFigure(2));
    }
}
