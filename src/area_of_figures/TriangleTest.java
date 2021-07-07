package area_of_figures;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testCorrectGetArea() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Assert.assertEquals(6.0, triangle.getArea(), 0.01);
    }

    @Test
    public void testGetSides() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        assert (triangle.getSide_a() > 0 && triangle.getSide_b() > 0 && triangle.getSide_c() > 0);
    }

    @Test
    public void tesGetType() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        assert (triangle.toString().equalsIgnoreCase("triangle"));
    }
}
