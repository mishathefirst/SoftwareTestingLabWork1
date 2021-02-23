public class SelectionSortProgram {

    public int[] sort(int[] initialArray) {
        int current, point, min;
        for (int i = 0; i < initialArray.length; i++) {
            current = initialArray[i];
            min = current;
            point = i;
            for (int k = i + 1; k < initialArray.length; k++) {
                if (initialArray[k] < min) {
                    min = initialArray[k];
                    point = k;
                }
            }
            initialArray[i] = initialArray[point];
            initialArray[point] = current;
        }
        return initialArray;
    }
}
