package area_of_figures;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testCorrectGetArea() {
        Square square = new Square(3.5);
        Assert.assertEquals(12.25, square.getArea(), 0.01);
    }

    @Test
    public void testGetSide() {
        Square square = new Square(3.0);
        assert (square.getSide() > 0);
    }

    @Test
    public void testGetType() {
        Square square = new Square(2.0);
        assert (square.toString().equalsIgnoreCase("square"));
    }
}
