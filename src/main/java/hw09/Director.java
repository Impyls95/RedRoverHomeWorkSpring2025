package hw09;

public class Director extends Manager{

    public Director(String name, int age, String sex, double salaryPerDay, int countOfSubordinates) {
        super(name, age, sex, salaryPerDay, countOfSubordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;

        for (Month month : monthArray) {
            salary += month.getWorkDaysCount() * getSalaryPerDay();
        }

        double allowance = salary * (getCountOfSubordinates() * 0.03);
        return salary + allowance;
    }
}
