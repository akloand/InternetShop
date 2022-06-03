package Date;

import java.time.LocalDate;
import java.time.Period;

public class DateTest {

    public static String getPeriodFromJavaBirthday() {
        LocalDate birthday = LocalDate.of(1995, 5, 23);
        LocalDate now = LocalDate.now();

        Period period = birthday.until(now);

        return period.getYears() + " years, " + period.getMonths() + " month, " + period.getDays() + " days"+ period.toTotalMonths();

    }
}
