package hw07.three;

public class Task1 {

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSubtraction(int a, int b) {
        return a - b;
    }

    public static int getMultiplication(int a, int b) {
        return a * b;
    }

    public static int getDivision(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(4,8));
        System.out.println(getSubtraction(11, 2));
        System.out.println(getMultiplication(6, 6));
        System.out.println(getDivision(10, 2));
    }
}
