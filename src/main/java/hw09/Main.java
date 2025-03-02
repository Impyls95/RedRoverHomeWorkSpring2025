package hw09;

public class Main {
    public static void main(String[] args) {
        Month[] months = MonthUtils.getMonths();
        for (Month month : months) {
            System.out.println("------");
            System.out.println(month.getMonthName() +
                    "\nВсего дней: " + month.getDaysCount() +
                    "\nРабочих дней: " + month.getWorkDaysCount());
        }

        Employee dmitry = new Employee("Дмитрий", 300);

        Month[] firstQuartetMonthArr = {MonthUtils.getJanuary(), MonthUtils.getFebruary(), MonthUtils.getMarch()};
        double salaryForFirstQuartetDmitry = dmitry.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Дмитрия за первый квартал: " + salaryForFirstQuartetDmitry);

        Manager andrey = new Manager("Андрей", 45, "Male", 350, 7);
        double salaryForFirstQuartetAndrey = andrey.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Андрея за первый квартал: " + salaryForFirstQuartetAndrey);

        dmitry.setAge(31);
        dmitry.setSex("Male");
        Manager managerDmitry = dmitry.convertToManager(5);
        System.out.println(managerDmitry.getSalary(firstQuartetMonthArr));

        Director aleksandr = new Director("Александр", 40, "male", 600, 15);
        System.out.println(aleksandr.getSalary(firstQuartetMonthArr));

        Employee[] employeesArr = {dmitry, andrey, aleksandr};
        double totalSalaryPerDay = SalaryUtils.getTotalSalaryPerDay(employeesArr);
        System.out.println(totalSalaryPerDay);

        double totalSalaryFirstQuartet = SalaryUtils.getTotalSalary(employeesArr, firstQuartetMonthArr);
        System.out.println(totalSalaryFirstQuartet);
    }
}
