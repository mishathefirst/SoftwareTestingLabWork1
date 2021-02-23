import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    SelectionSortProgram selection = new SelectionSortProgram();

    @Test
    public void sortCheck1() {
        int[] array = {1, 2, 3, 4, 5};
        int[] toSortArray = {4, 1, 2, 5, 3};
        assertArrayEquals(array, selection.sort(toSortArray));
    }

    @Test
    public void sortCheck2() {
        int[] array = {1, 1, 3, 3, 5, 7, 8, 8, 9, 10, 15, 18};
        int[] toSortArray = {5, 3, 10, 8, 1, 9, 18, 3, 8, 15, 1, 7};
        assertArrayEquals(array, selection.sort(toSortArray));
    }

    @Test
    public void sortCheck3() {
        int[] array = {1, 1, 1};
        int[] toSortArray = {1, 1, 1};
        assertArrayEquals(array, selection.sort(toSortArray));
    }

    @Test
    public void sortCheck4() {
        int[] array = {1, 2, 3, 4, 5};
        int[] toSortArray = {5, 4, 3, 2, 1};
        assertArrayEquals(array, selection.sort(toSortArray));
    }

}
