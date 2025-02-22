package hw08;

public class MonthUtils {

    public static Month[] getMonth() {
        return new Month[] {getJanuary(), getFebruary(), getMarch(), getApril(), getMay(), getJune(),
                getJuly(), getAugust(), getSeptember(), getOctober(), getNovember(), getDecember()};
    }

    public static Month getJanuary() {
        Month january = new Month();
        january.monthName = "Январь";
        january.daysCount = 31;
        january.workDaysCount = 17;
        return january;
    }

    public static Month getFebruary() {
        Month february = new Month();
        february.monthName = "Февраль";
        february.daysCount = 28;
        february.workDaysCount = 20;
        return february;
    }

    public static Month getMarch() {
        Month march = new Month();
        march.monthName = "Март";
        march.daysCount = 31;
        march.workDaysCount = 21;
        return march;
    }

    public static Month getApril() {
        Month april = new Month();
        april.monthName = "Апрель";
        april.daysCount = 30;
        april.workDaysCount = 22;
        return april;
    }

    public static Month getMay() {
        Month may = new Month();
        may.monthName = "Май";
        may.daysCount = 31;
        may.workDaysCount = 18;
        return may;
    }

    public static Month getJune() {
        Month june = new Month();
        june.monthName = "Июнь";
        june.daysCount = 30;
        june.workDaysCount = 19;
        return june;
    }

    public static Month getJuly() {
        Month july = new Month();
        july.monthName = "Июль";
        july.daysCount = 31;
        july.workDaysCount = 23;
        return july;
    }

    public static Month getAugust() {
        Month august = new Month();
        august.monthName = "Август";
        august.daysCount = 31;
        august.workDaysCount = 21;
        return august;
    }

    public static Month getSeptember() {
        Month september = new Month();
        september.monthName = "Сентябрь";
        september.daysCount = 30;
        september.workDaysCount = 22;
        return september;
    }

    public static Month getOctober() {
        Month october = new Month();
        october.monthName = "Октябрь";
        october.daysCount = 31;
        october.workDaysCount = 23;
        return october;
    }

    public static Month getNovember() {
        Month november = new Month();
        november.monthName = "Ноябрь";
        november.daysCount = 30;
        november.workDaysCount = 19;
        return november;
    }

    public static Month getDecember() {
        Month december = new Month();
        december.monthName = "Декабрь";
        december.daysCount = 31;
        december.workDaysCount = 22;
        return december;
    }
}
