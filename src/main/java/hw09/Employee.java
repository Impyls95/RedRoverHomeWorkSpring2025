package hw09;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    public Employee(String name, double salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, double salaryPerDay, int age, String sex) {
        this(name, salaryPerDay);
        this.age = age;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalaryPerDay() {
        return this.salaryPerDay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            salary += month.getWorkDaysCount() * salaryPerDay;
        }
        return salary;
    }

    public Manager convertToManager(int numberOfSubordinates) {
        if (age == 0 || sex == null) {
            throw new IllegalArgumentException("Недостаточно полей для создания экземпляра класса Manager");
        }
        return new Manager(this.name, this.age, this.sex, this.salaryPerDay, numberOfSubordinates);
    }
}
