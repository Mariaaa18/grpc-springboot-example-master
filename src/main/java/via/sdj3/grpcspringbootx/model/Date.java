package via.sdj3.grpcspringbootx.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Date {
    /**
     * private attribute for holding day
     */
    private int day;

    /**
     * private attribute for holding month
     */
    private int month;

    /**
     * private attribute for holding year
     */
    private int year;
    /**
     * Getter for day
     * @return day
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Getter for month
     * @return month
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Getter for year
     * @return year
     */
    public int getYear() {
        return this.year;
    }
    /**
     * Compare two dates
     * @param d Date
     * @return true if it is earlier than d
     */
    public boolean compareTo(Date d) {
        int day1 = d.getDay();
        int month1 = d.getMonth();
        int year1 = d.getYear();
        return (this.year <= year1) && (this.month <= month1) && (this.day <= day1);
    }
    /**
     * return a string representation
     * convert to ISO 8601 Date Format
     * http://en.wikipedia.org/wiki/ISO_8601
     * @return
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(this.year));
        s.append("-");
        if (this.month < 10) s.append("0");
        s.append(String.valueOf(this.month));
        s.append("-");
        if (this.day < 10) s.append("0");
        s.append(String.valueOf(this.day));
        return s.toString();
    }
    /**
     * Check if given year/month/day is valid
     * @param year
     * @param month
     * @param day
     * @return true if it is valid date
     */
    public static boolean isValid(int year, int month, int day) {
        if (year < 0) return false;
        if ((month < 1) || (month > 12)) return false;
        if ((day < 1) || (day > 31)) return false;
        switch (month) {
            case 1:
                return true;
            case 2:
                return (isLeap(year) ? day <= 29 : day <= 28);
            case 3:
                return true;
            case 4:
                return day < 31;
            case 5:
                return true;
            case 6:
                return day < 31;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return day < 31;
            case 10:
                return true;
            case 11:
                return day < 31;
            default:
                return true;
        }
    }



        /**
         * Check given year is leap year
         * @param year
         * @return true if year is leap year
         */
    public static boolean isLeap(int year) {
            // using system library to do this, avoid re-invent the wheel
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public Date(int year, int month, int day) throws IllegalArgumentException{
        if (!isValid(year, month, day)) throw new IllegalArgumentException();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        java.util.Date x = currentDate.getTime();
        SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
        this.year = Integer.parseInt(formatyear.format(x));
        SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
        this.month = Integer.parseInt(formatmonth.format(x));
        SimpleDateFormat formatdd = new SimpleDateFormat("dd");
        this.day = Integer.parseInt(formatdd.format(x));
    }

}
