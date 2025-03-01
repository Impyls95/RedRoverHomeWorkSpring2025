package hw09;

public class Month {
    private final String monthName;
    private final int daysCount;
    private final  int workDaysCount;

    public Month(String monthName, int daysCount, int workDaysCount) {
        this.monthName = monthName;
        this.daysCount = daysCount;
        this.workDaysCount = workDaysCount;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public int getWorkDaysCount() {
        return workDaysCount;
    }
}
