public class ArithmeticCalculator{
    public static int a;
    public static int b;
    public static int result;

    public ArithmeticCalculator(){
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation operation, int a, int b){
        switch(operation){
            case ADD :
               return   a + b;
            case SUBSTRACT :
               return   a - b;
            case MULTIPLY :
                return a * b;
        }
        return result;
    }
}





