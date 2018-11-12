package com.kodilla.testing.shape;

import org.junit.*;

import java.util.List;

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
    public void testAddShape() {
        //Given
        Square square = new Square("Square", 10);
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure(square);

        //Then
        Assert.assertEquals(1, theShape.getShapesQuantity());
    }

    @Test
    public void testRemoveShapeNotExisting() {
        //Given
        Square square = new Square("Square", 10);
        ShapeCollector theShape = new ShapeCollector();

        //When
        boolean result = theShape.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveShape() {
        //Given
        Square square = new Square("Square", 10);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(square);


        //When
        boolean result = theShape.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, theShape.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square("Square", 10);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(square);

        //When
        Shape theRetrieved;
        theRetrieved = theShape.getFigure(0);

        //Then
        Assert.assertEquals(square, theRetrieved);
    }

    @Test
    public void testShowFigures() {
        //Given
        Square square = new Square("Square", 10);
        Circle circle = new Circle("Circle", 5);
        Triangle triangle = new Triangle("Triangle", 5, 2);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(square);
        theShape.addFigure(circle);
        theShape.addFigure(triangle);

        //When
        List<Shape> result = theShape.showFigures();
        Shape[] figures = new Shape[]{square, circle, triangle};

        //Then
        Assert.assertArrayEquals(figures, result.toArray());
    }

}
