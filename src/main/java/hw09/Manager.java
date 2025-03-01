package hw09;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;
    private int countOfSubordinates;

    public Manager(String name, int age, String sex, double salaryPerDay, int countOfSubordinates) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.countOfSubordinates = countOfSubordinates;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getCountOfSubordinates() {
        return countOfSubordinates;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0;

        for (Month month : monthArray) {
            salary += month.getWorkDaysCount() * salaryPerDay;
        }

        double allowance = salary * (countOfSubordinates * 0.01);
        return salary + allowance;
    }
}
