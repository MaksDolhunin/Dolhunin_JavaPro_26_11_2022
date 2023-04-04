package test.homework23;

import com.hillel.dolhunin.homework.homework23.task2.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void returnNull() {
        Assertions.assertNull(Arrays.checkArrays(null));
    }

    @Test
    public void returnEmptyArray() {
        int[] array = {1, 4, 1, 4, 1, 4};
        int[] newArray = {};
        Assertions.assertArrayEquals(newArray, Arrays.checkArrays(array));
    }

    @Test
    void runtimeException() {
        int[] array = {2, 3, 5};
        Assertions.assertThrows(RuntimeException.class, () -> Arrays.checkArrays(array));
    }

    @Test
    void returnValuesInArrayAfterLastNumberFour() {
        int[] array = {1, 3, 5, 4, 6, 7, 1, 7};
        int[] result = {6, 7, 1, 7};
        Assertions.assertArrayEquals(result, Arrays.checkArrays(array));
    }

    @Test
    void returnFalse() {
        int[] array = {1, 2, 3, 5, 6};
        int[] array1 = null;
        int[] array2 = {};
        Assertions.assertFalse(Arrays.checkArrayForOneAndFour(array));
        Assertions.assertFalse(Arrays.checkArrayForOneAndFour(array1));
        Assertions.assertFalse(Arrays.checkArrayForOneAndFour(array2));
    }

    @Test
    void returnTrue() {
        int[] array = {1, 1, 1};
        int[] array1 = {4, 4};
        int[] array2 = {4, 1, 4};
        Assertions.assertTrue(Arrays.checkArrayForOneAndFour(array));
        Assertions.assertTrue(Arrays.checkArrayForOneAndFour(array1));
        Assertions.assertTrue(Arrays.checkArrayForOneAndFour(array2));
    }

}
