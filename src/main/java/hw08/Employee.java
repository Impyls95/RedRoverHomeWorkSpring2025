package hw08;

public class Employee {
    String name;
    int age;
    String sex;
    double salaryPerDay;

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            salary += month.workDaysCount * salaryPerDay;
        }
        return salary;
    }
}
