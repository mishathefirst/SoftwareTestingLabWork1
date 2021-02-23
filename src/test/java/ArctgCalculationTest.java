import org.junit.Test;

import static org.junit.Assert.*;

public class ArctgCalculationTest {

    ArctgCalculation arctgCalculation = new ArctgCalculation();

    //Basic points which belong to the graph
    @Test
    public void check1GraphPoint() {
        assertEquals(0.0, arctgCalculation.calculate(0), Math.pow(10, -4));
    }

    @Test
    public void check2GraphPoint() {
        assertEquals(0.78539, arctgCalculation.calculate(1), Math.pow(10, -4));
    }

    @Test
    public void check3GraphPoint() {
        assertEquals(-0.78539, arctgCalculation.calculate(-1), Math.pow(10, -4));
    }

    @Test
    public void check4GraphPoint() {
        assertEquals(0.46364, arctgCalculation.calculate(0.5), Math.pow(10, -4));
    }

    @Test
    public void check5GraphPoint() {
        assertEquals(-0.46364, arctgCalculation.calculate(-0.5), Math.pow(10, -4));
    }


    //Points that do not belong to the graph
    @Test
    public void check1NearGraphPoint() {
        assertNotEquals(0.78560, arctgCalculation.calculate(1), Math.pow(10, -4));
    }
    @Test
    public void check2NearGraphPoint() {
        assertNotEquals(-0.78560, arctgCalculation.calculate(-1), Math.pow(10, -4));
    }
    @Test
    public void check3NearGraphPoint() {
        assertNotEquals(0.78528, arctgCalculation.calculate(1), Math.pow(10, -4));
    }
    @Test
    public void check4NearGraphPoint() {
        assertNotEquals(-0.78528, arctgCalculation.calculate(-1), Math.pow(10, -4));
    }
    @Test
    public void check5NearGraphPoint() {
        assertNotEquals(0.00011, arctgCalculation.calculate(0), Math.pow(10, -4));
    }
    @Test
    public void check6NearGraphPoint() {
        assertNotEquals(-0.00011, arctgCalculation.calculate(0), Math.pow(10, -4));
    }
    @Test
    public void check7NearGraphPoint() {
        assertNotEquals(0.46380, arctgCalculation.calculate(0.5), Math.pow(10, -4));
    }
    @Test
    public void check8NearGraphPoint() {
        assertNotEquals(0.46349, arctgCalculation.calculate(0.5), Math.pow(10, -4));
    }
    @Test
    public void check9NearGraphPoint() {
        assertNotEquals(-0.46380, arctgCalculation.calculate(-0.5), Math.pow(10, -4));
    }
    @Test
    public void check10NearGraphPoint() {
        assertNotEquals(-0.46349, arctgCalculation.calculate(-0.5), Math.pow(10, -4));
    }


    //Out of the domain of the function points
    @Test(expected = ArithmeticException.class)
    public void check1OutOfDomainPoint() {
        arctgCalculation.calculate(2);
    }

    @Test(expected = ArithmeticException.class)
    public void check2OutOfDomainPoint() {
        arctgCalculation.calculate(-2);
    }

    @Test(expected = ArithmeticException.class)
    public void check3OutOfDomainPoint() {
        arctgCalculation.calculate(1.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void check4OutOfDomainPoint() {
        arctgCalculation.calculate(-1.0001);
    }

}
