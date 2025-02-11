package hw04;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----");
        for (int i = 40; i < 61; i += 4) {
            System.out.println(i);
        }
    }
}
