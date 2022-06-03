package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate birthday = LocalDate.of(1983, 1, 27);
        System.out.println(birthday);
        System.out.println(birthday.plusYears(18));
        System.out.println(birthday.atTime(12,45));
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);



    }


}
