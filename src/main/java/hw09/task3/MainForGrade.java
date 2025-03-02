package hw09.task3;

public class MainForGrade {
    public static void main(String[] args) {
        Grade g1 = new Grade(5);
        Grade g11 = new Grade(1);
        Grade g2 = new Grade('A');
        Grade g22 = new Grade('C');
        System.out.println(g1.getStringGrade());
        System.out.println(g11.getStringGrade());
        System.out.println(g2.getStringGrade());
        System.out.println(g22.getStringGrade());
    }
}
