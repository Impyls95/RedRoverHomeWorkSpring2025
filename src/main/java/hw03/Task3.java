package hw03;

public class Task3 {
    public static void main(String[] args) {
        int n = 28;
        if (n > 10) {
            System.out.println("больше 10 ");
        }
        if (n < 100) {
            System.out.println("меньше 100 ");
        }
        if (n * 1.0 / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (n >= 5 && n <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
