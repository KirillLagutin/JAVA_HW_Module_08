import org.junit.*;

import static org.junit.Assert.assertEquals;


public class Testing {

    private Figures curFigure;

    @Before
    public void setUp(){
        curFigure = new Figures();
    }

    @After
    public void tearDown(){
        curFigure = null;
    }

    @org.junit.Test
    public void testTriangleArea(){
        double result = curFigure.AreaOfTriangle(5, 6);
        assertEquals(15, result, 0);
    }
    @org.junit.Test
    public void testRectangleArea(){
        double result = curFigure.AreaOfRectangle(5, 6);
        assertEquals(30, result, 0);
    }

    @org.junit.Test
    public void testSquareArea(){
        double result = curFigure.AreaOfSquare(5);
        assertEquals(25, result, 0);
    }

    @org.junit.Test
    public void testRhombusArea(){
        double result = curFigure.AreaOfRhombus(5, 6);
        assertEquals(30, result, 0);
    }


}
