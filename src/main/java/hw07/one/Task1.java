package hw07.one;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}
