package hw09;

public class SalaryUtils {

    public static double getTotalSalaryPerDay(Employee[] employees) {
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalaryPerDay();
        }
        return totalSalary;
    }

    public static double getTotalSalary(Employee[] employees, Month[] monthArray) {
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary(monthArray);
        }
        return totalSalary;
    }
}
