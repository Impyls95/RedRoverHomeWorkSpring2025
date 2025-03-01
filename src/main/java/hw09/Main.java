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

        Employee Dmitry = new Employee("Дмитрий", 300);

        Month[] firstQuartetMonthArr = {MonthUtils.getJanuary(), MonthUtils.getFebruary(), MonthUtils.getMarch()};
        double salaryForFirstQuartetDmitry = Dmitry.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Дмитрия за первый квартал: " + salaryForFirstQuartetDmitry);

        Manager Andrey = new Manager("Андрей", 45, "Male", 350, 7);
        double salaryForFirstQuartetAndrey = Andrey.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Андрея за первый квартал: " + salaryForFirstQuartetAndrey);

        Dmitry.setAge(31);
        Dmitry.setSex("Male");
        Manager managerDmitry = Dmitry.convertToManager(5);
        System.out.println(managerDmitry.getSalary(firstQuartetMonthArr));
    }
}
