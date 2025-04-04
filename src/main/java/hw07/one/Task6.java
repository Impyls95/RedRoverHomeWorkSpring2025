package hw07.one;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = array[i][j];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
