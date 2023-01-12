public class Main {
    public static void main(String[] args){
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        int result = calculator.calculate(Operation.SUBSTRACT, 1234, 2);
        System.out.println(result);

    }
}
