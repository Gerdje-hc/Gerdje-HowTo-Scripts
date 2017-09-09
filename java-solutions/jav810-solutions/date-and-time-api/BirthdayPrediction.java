import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class BirthdayPrediction {
    public static void main(String[] args) {
        System.out.println(daysUntilNextBirthday("15/03/1983"));

    }

    private static long daysUntilNextBirthday(String date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.from(f.parse(date));
        LocalDate now = LocalDate.now();

        LocalDate nextBirthDay = birthDate.with(ChronoField.YEAR, now.getYear());
        if(nextBirthDay.isBefore(now)) {
            nextBirthDay = nextBirthDay.plus(1, ChronoUnit.YEARS);
        }
        return ChronoUnit.DAYS.between(now, nextBirthDay);
    }
}
