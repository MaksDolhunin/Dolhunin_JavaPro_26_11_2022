package test.homework23;

import com.hillel.dolhunin.homework.homework21.anotation.Test;
import com.hillel.dolhunin.homework.homework23.task1.SimpleMathLibrary;
import org.junit.jupiter.api.Assertions;

public class SimpleMathLibraryTest {

    @Test
    public void sum(double a, double b) {

        double result = SimpleMathLibrary.add(9.5, 10.5);

        Assertions.assertEquals(20.0, result);
    }

    @Test
    public void minus(double a, double b) {

        double result = SimpleMathLibrary.minus(9.5, 10.5);

        Assertions.assertEquals(-1, result);
    }

}
