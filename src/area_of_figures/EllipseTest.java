package area_of_figures;

import org.junit.Assert;
import org.junit.Test;

public class EllipseTest {

    @Test
    public void testCorrectGetArea() {
        Ellipse ellipse = new Ellipse(4.0, 1.2);
        Assert.assertEquals(15.07, ellipse.getArea(), 0.01);
    }

    @Test
    public void testGetRadius() {
        Ellipse ellipse = new Ellipse(12.5, 5.7);
        assert (ellipse.getRadius_a() != ellipse.getRadius_b());
        assert (ellipse.getRadius_a() > 0 && ellipse.getRadius_b() > 0);
    }

    @Test
    public void testCorrectP() {
        Ellipse ellipse = new Ellipse(3.5, 1.5);
        assert (ellipse.getP() == 3.14);
    }

    @Test
    public void testGetType() {
        Ellipse ellipse = new Ellipse(3.5, 7.1);
        assert (ellipse.toString().equalsIgnoreCase("ellipse"));
    }
}
