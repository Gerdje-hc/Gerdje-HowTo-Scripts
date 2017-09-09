import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Superstitious {

    public static final int FROM_YEAR = 2000;
    public static final int TO_YEAR = 2099;
    public static final int SUBJECT_DAY_OF_MONTH = 13;
    public static final DayOfWeek SUBJECT_DAY_OF_WEEK = DayOfWeek.FRIDAY;

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(FROM_YEAR, Month.JANUARY, SUBJECT_DAY_OF_MONTH);
        while(TO_YEAR >= date.getYear()) {
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("Woo! " + date + " is " + SUBJECT_DAY_OF_WEEK.name().toLowerCase() + " the " + SUBJECT_DAY_OF_MONTH + "th");
            }
            date = date.plus(1, ChronoUnit.MONTHS);
        }
    }
}
