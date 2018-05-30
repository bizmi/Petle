package task1;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
            IntegerMath add =(a,b) -> a + b;
            IntegerMath sub = (a,b) ->  a-b;

        System.out.println(calculator.operateBinary(5,6, sub));
        System.out.println(calculator.operateBinary(2,1,add));
    }
    private int operateBinary(int a , int b, IntegerMath integerMath){
        return integerMath.operate(a, b);

    }
}
