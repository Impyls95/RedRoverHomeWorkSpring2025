package hw07.one;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        int avg = sum / array.length;
        System.out.println(avg);
    }
}
