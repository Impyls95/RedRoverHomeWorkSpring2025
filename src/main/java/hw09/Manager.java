package hw09;

public class Manager extends Employee{
    private int age;
    private String sex;
    private int countOfSubordinates;

    public Manager(String name, int age, String sex, double salaryPerDay, int countOfSubordinates) {
        super(name, salaryPerDay);
        this.age = age;
        this.sex = sex;
        this.countOfSubordinates = countOfSubordinates;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getCountOfSubordinates() {
        return countOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;

        for (Month month : monthArray) {
            salary += month.getWorkDaysCount() * getSalaryPerDay();
        }

        double allowance = salary * (countOfSubordinates * 0.01);
        return salary + allowance;
    }
}
