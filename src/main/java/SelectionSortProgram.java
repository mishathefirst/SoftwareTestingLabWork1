public class SelectionSortProgram {

    public int[] sort(int[] initialArray) {
        int current, point, min, tmp;
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
            //tmp = initialArray[current];
            initialArray[i] = initialArray[point];
            initialArray[point] = current;
            //initialArray[i] = current;
            for (int j : initialArray) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        return initialArray;
    }
}
