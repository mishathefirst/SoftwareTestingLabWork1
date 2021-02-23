public class ArctgCalculation {

    private double result;


    public double calculate(double arg) {
        return rowArctg(arg);
    }

    public double getResult() {
        return result;
    }

    public ArctgCalculation(){}


    public ArctgCalculation(double argument) {
        this.result = calculate(argument);
    }


    //Is limit on X needed?
    private double rowArctg(double x) {
        int n = 1;
        double y = 0;
        double yPrevious = 5;
        //if (Math.abs(x) <= 1) {
            while (Math.abs(y - yPrevious) > Math.pow(10, -5)) {
                yPrevious = y;
                y = y + Math.pow(-1, (n - 1)) * ((Math.pow(x, (2 * n - 1))) / (2 * n - 1));
                n++;
            }
            return y;
        //} else {
            //throw new ArithmeticException();
        //}
    }

}
