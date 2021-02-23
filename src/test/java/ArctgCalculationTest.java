import org.junit.Test;

import static org.junit.Assert.*;

public class ArctgCalculationTest {

    ArctgCalculation arctgCalculation = new ArctgCalculation();

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
        assertEquals(1.10714, arctgCalculation.calculate(2), Math.pow(10, -4));
    }

}
