package calculator;

import org.junit.jupiter.api.Test;
import providers.BasicMath;
import providers.Calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTests {

    @Test
    public void testEvaluate_addition() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("add");
        c.setCurrentValue(660.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(6.0);
        c.setCurrentOperator("=");

        assertEquals(666.0, calc.evaluate(c));

    }

    @Test
    public void testEvaluate_subtract() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("subtract");
        c.setCurrentValue(667.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(1.0);
        c.setCurrentOperator("=");

        assertEquals(666.0, calc.evaluate(c));
    }

    @Test
    public void testEvaluate_multiply() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("multiply");
        c.setCurrentValue(333.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(2.0);
        c.setCurrentOperator("=");

        assertEquals(666.0, calc.evaluate(c));
    }

    @Test
    public void testEvaluate_divide() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("divide");
        c.setCurrentValue(333.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(0.5);
        c.setCurrentOperator("=");

        assertEquals(666.0, calc.evaluate(c));

    }

    @Test
    public void testEvaluate_sin() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("sin");
        c.setCurrentValue(30d);
        assertEquals(0.5, calc.evaluate(c), 0.1 * 15);
    }

    @Test
    public void testEvaluate_cos() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("cos");
        c.setCurrentValue(60d);
        assertEquals(0.5, calc.evaluate(c), 0.1 * 15);
    }

    @Test
    public void testEvaluate_tan() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("tan");
        c.setCurrentValue(45d);
        assertEquals(1, calc.evaluate(c), 0.1 * 15);
    }

    @Test
    public void testEvaluate_ctg() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("ctg");
        c.setCurrentValue(45d);
        assertEquals(1, calc.evaluate(c), 0.1 * 15);
    }

    @Test
    public void testEvaluate_mod() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("mod");
        c.setCurrentValue(7.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(3d);
        c.setCurrentOperator("=");

        assertEquals(1.0, calc.evaluate(c), 0.1 * 15);

    }

    @Test
    public void testEvaluate_power() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("power");
        c.setCurrentValue(2.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(3d);
        c.setCurrentOperator("=");

        assertEquals(8.0, calc.evaluate(c), 0.1 * 15);

    }

    @Test
    public void testEvaluate_sqrt() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("sqrt");
        c.setCurrentValue(4.0);

        assertEquals(2.0, calc.evaluate(c), 0.1 * 15);
    }

    @Test
    public void testEvaluate_factorial() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("factorial");
        c.setCurrentValue(5.0);

        assertEquals(120.0, calc.evaluate(c), 0.1 * 15);

    }
    @Test
    public void testEvaluate_gcd() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("gcd");
        c.setCurrentValue(2.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(3d);
        c.setCurrentOperator("=");

        assertEquals(1.0, calc.evaluate(c), 0.1 * 15);

    }
    @Test
    public void testEvaluate_lcm() {
        BasicCalculator calc = new BasicCalculator(new BasicMath());
        Calculation c = new Calculation();
        c.setCurrentOperator("lcm");
        c.setCurrentValue(2.0);
        calc.evaluate(c);
        c = new Calculation();
        c.setCurrentValue(3d);
        c.setCurrentOperator("=");

        assertEquals(6.0, calc.evaluate(c), 0.1 * 15);

    }
}
