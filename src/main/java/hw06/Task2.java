package hw06;

public class Task2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'е') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
