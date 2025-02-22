package hw08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Month[] months = MonthUtils.getMonth();
        for (Month month : months) {
            System.out.println("------");
            System.out.println(month.monthName +
                    "\nВсего дней: " + month.daysCount +
                    "\nРабочих дней: " + month.workDaysCount);
        }

        Employee Dmitry = new Employee();
        Dmitry.name = "Дмитрий";
        Dmitry.age = 31;
        Dmitry.salaryPerDay = 300;

        Month[] firstQuartetMonthArr = {MonthUtils.getJanuary(), MonthUtils.getFebruary(), MonthUtils.getMarch()};
        double salaryForFirstQuartetDmitry = Dmitry.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Дмитрия за первый квартал: " + salaryForFirstQuartetDmitry);

        Manager Andrey = new Manager();
        Andrey.salaryPerDay = 100;
        Andrey.countOfSubordinates = 7;
        double salaryForFirstQuartetAndrey = Andrey.getSalary(firstQuartetMonthArr);
        System.out.println("Зарплата Андрея за первый квартал: " + salaryForFirstQuartetAndrey);
    }
}
