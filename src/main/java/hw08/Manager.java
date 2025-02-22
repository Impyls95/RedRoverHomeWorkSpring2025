package hw08;

public class Manager {
    String name;
    int age;
    String sex;
    double salaryPerDay;
    int countOfSubordinates;

    public double getSalary(Month[] monthArray) {
        double salary = 0;

        for (Month month : monthArray) {
            salary += month.workDaysCount * salaryPerDay;
        }

        double allowance = salary * (countOfSubordinates * 0.01);
        return salary + allowance;
    }
}
