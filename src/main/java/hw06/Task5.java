package hw06;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int[][] copyArr = new  int[5][5];
        int n = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        System.out.println("Исходный массив: ");
        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));
        }

        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = Arrays.copyOf(arr[i], arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[j][i] = copyArr[i][j];
            }
        }
        System.out.println("Преобразованный массив: ");
        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));
        }
    }
}
