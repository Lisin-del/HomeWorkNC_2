package area_of_figures;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testCorrectGetArea() {
        Circle circle = new Circle(3.0);
        Assert.assertEquals(28.26, circle.getArea(), 0.01);
    }

    @Test
    public void testGetRadius() {
        Circle circle = new Circle(5.0);
        assert (circle.getRadius() > 0);
    }

    @Test
    public void testGetType() {
        Circle circle = new Circle(3.5);
        assert (circle.toString().equalsIgnoreCase("circle"));
    }
}
