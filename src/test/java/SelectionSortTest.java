import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    SelectionSortProgram selection = new SelectionSortProgram();

    //sorted arrays points tests
    @Test
    public void pointCheck1() {
        int arrayPoint = 5;
        int[] toSortArray = {4, 1, 2, 5, 3, 3, 9, 7, 5, 4, 10, 4, 5};
        assertEquals(arrayPoint, selection.sort(toSortArray)[8]);
    }

    @Test
    public void pointCheck2() {
        int arrayPoint = 10;
        int[] toSortArray = {5, 1, 8, 10, 11, 7, 6, 3, 4, 7, 15, 17, 20};
        assertEquals(arrayPoint, selection.sort(toSortArray)[8]);
    }

    @Test
    public void pointCheck3() {
        int arrayPoint = 5;
        int[] toSortArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertEquals(arrayPoint, selection.sort(toSortArray)[5]);
    }



    //whole arrays tests
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
