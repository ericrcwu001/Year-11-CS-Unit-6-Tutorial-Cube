import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class CubeTester {

    @Test
    public void TestNoArgumentConstructorNoException() {
        Unit_6.Cube cube = new Unit_6.Cube();
        assertTrue("Ensure that your no argument constructor has been implemented correctly!", cube.getSide() == 1);
    }

    @Test
    public void TestSingleArgumentConstructorNoException() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        assertTrue("Ensure that your single argument constructor has been implemented correctly!", cube.getSide() == 5);
    }

    @Test
    public void TestSingleArgumentConstructorNegative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Unit_6.Cube(-1);});
    }

    @Test
    public void TestSingleArgumentConstructorZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Unit_6.Cube(0);});
    }

    @Test
    public void TestSetter() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        cube.setSide(7);
        assertTrue("Ensure that your setter method has been implemented correctly!", cube.getSide() == 7);
    }

    @Test
    public void TestSetterNegative() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(-1);});
    }

    @Test
    public void TestSetterZero() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(0);});
    }

    @Test
    public void TestVolume() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        int volume = cube.getVolume();
        assertTrue("Ensure that your getVolume method has been implemented correctly!", volume == 125);
    }

    @Test
    public void TestVolumeTwo() {
        Unit_6.Cube cube = new Unit_6.Cube(7);
        int volume = cube.getVolume();
        assertTrue("Ensure that your getVolume method has been implemented correctly!", volume == 343);
    }

    @Test
    public void TestSurfaceArea() {
        Unit_6.Cube cube = new Unit_6.Cube(5);
        int surfaceArea = cube.getSurfaceArea();
        assertTrue("Ensure that your getSurfaceArea method has been implemented correctly!", surfaceArea == 150);
    }

    @Test
    public void TestSurfaceAreaTwo() {
        Unit_6.Cube cube = new Unit_6.Cube(7);
        int surfaceArea = cube.getSurfaceArea();
        assertTrue("Ensure that your getSurfaceArea method has been implemented correctly!", surfaceArea == 294);
    }

}
