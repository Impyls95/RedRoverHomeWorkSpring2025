package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -3, -4, 0, 5};
        int n = signChange(arr);
        System.out.println(n);
    }

    public static int signChange(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= 0 && arr[i - 1] < 0) || (arr[i] < 0 && arr[i - 1] >= 0)) {
                count++;
            }
        }
        return count;
    }
}