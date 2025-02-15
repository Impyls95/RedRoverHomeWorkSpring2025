package hw06;

public class Task3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }
    }
}
