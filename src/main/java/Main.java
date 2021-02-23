public class Main {
    public static void main(String[] args) {
        ArctgCalculation arctgCalculation = new ArctgCalculation();
        System.out.println(arctgCalculation.calculate(0));
        System.out.println(arctgCalculation.calculate(1));
        System.out.println(arctgCalculation.calculate(-1));
        System.out.println(arctgCalculation.calculate(2));
        System.out.println(arctgCalculation.calculate(-2));
        System.out.println(arctgCalculation.calculate(0.5));
        System.out.println(arctgCalculation.calculate(-0.5));
    }
}
