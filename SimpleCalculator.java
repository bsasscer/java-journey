//a simple calculator that can add, subtract, multiply, divide and apply the modulo operator on two integers
public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b <= 0) {
            System.out.println("Error! Dividing by zero is not allowed");
        } else {
            return a / b;
        }
        return a / b;
    }
    public int modulo(int a, int b) {
        if (b <= 0) {
            System.out.println("Error! Dividing by zero is not allowed");
        } else {
            return a % b;
        }
        return a % b;
    }
    public static void main(String[] args) {
        SimpleCalculator myCalculator = new SimpleCalculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.modulo(24, 9));
    }
}
