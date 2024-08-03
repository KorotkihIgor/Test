import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormulasTest {
    Formulas sut;

    @BeforeEach
    public void setSut() {
        sut = new Formulas();
    }

    @Test
    public void testSquareCircle() {
        double a = 2, expected = 12.56;

        double result = sut.squareCircle(2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSquareArea() {
        int a = 5, expected = 25;

        int result = sut.squareArea(5);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSquareRectangle() {
        int a = 2, b = 5, expected = 10;

        int result = sut.squareRectangle(2, 5);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSquareThreeCornered() {
        double a = 1, b = 2.5, expected = 1.25;

        double result = sut.squareThreeCornered(1, 2.5);

        Assertions.assertEquals(expected, result);
    }
}
