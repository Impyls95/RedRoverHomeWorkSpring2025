package hw06;

public class Task1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'о') {
                System.out.println(c);
            }
        }
    }
}
