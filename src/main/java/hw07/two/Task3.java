package hw07.two;

public class Task3 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            str += "  ";
            System.out.print(str);

        }
    }
}
