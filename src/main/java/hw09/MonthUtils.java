package hw09;

public class MonthUtils {

    public static Month[] getMonths() {
        return new Month[] {getJanuary(), getFebruary(), getMarch(), getApril(), getMay(), getJune(),
                getJuly(), getAugust(), getSeptember(), getOctober(), getNovember(), getDecember()};
    }

    public static Month getJanuary() {
        Month january = new Month("Январь", 31, 17);
        return january;
    }

    public static Month getFebruary() {
        Month february = new Month("Февраль", 28, 20);
        return february;
    }

    public static Month getMarch() {
        Month march = new Month("Март", 31, 21);
        return march;
    }

    public static Month getApril() {
        Month april = new Month("Апрель", 30, 22);
        return april;
    }

    public static Month getMay() {
        Month may = new Month("Май", 31, 18);
        return may;
    }

    public static Month getJune() {
        Month june = new Month("Июнь", 30, 19);
        return june;
    }

    public static Month getJuly() {
        Month july = new Month("Июль", 31, 23);
        return july;
    }

    public static Month getAugust() {
        Month august = new Month("Август", 31, 21);
        return august;
    }

    public static Month getSeptember() {
        Month september = new Month("Сентябрь", 30, 22);
        return september;
    }

    public static Month getOctober() {
        Month october = new Month("Октябрь", 31, 23);
        return october;
    }

    public static Month getNovember() {
        Month november = new Month("Ноябрь", 30, 19);
        return november;
    }

    public static Month getDecember() {
        Month december = new Month("Декабрь", 31, 22);
        return december;
    }
}
