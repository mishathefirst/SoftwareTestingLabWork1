public class Main {
    public static void main(String[] args) {
        /*
        ArctgCalculation arctgCalculation = new ArctgCalculation();
        System.out.println(arctgCalculation.calculate(0));
        System.out.println(arctgCalculation.calculate(1));
        System.out.println(arctgCalculation.calculate(-1));
        System.out.println(arctgCalculation.calculate(2));
        System.out.println(arctgCalculation.calculate(-2));
        System.out.println(arctgCalculation.calculate(0.5));
        System.out.println(arctgCalculation.calculate(-0.5));
         */

        SelectionSortProgram selection = new SelectionSortProgram();
        int[] array = {5, 3, 10, 8, 1, 9, 18, 3, 8, 15, 1, 7};
        int[] newArray = selection.sort(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
