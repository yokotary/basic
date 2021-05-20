package objectSample.dateTimeSample;

import java.time.LocalDateTime;
import java.time.Month;

class LocalDateSample2 {
    public static void main(String[] args) {
        LocalDateTime someDateTime = LocalDateTime.of(1981, Month.NOVEMBER, 25, 18, 0, 0);

        System.out.println(someDateTime.getYear());
        System.out.println(someDateTime.getMonth());
        System.out.println(someDateTime.getMonthValue());
        System.out.println(someDateTime.getDayOfMonth());
        System.out.println(someDateTime.getMinute());
        System.out.println(someDateTime.getSecond());
    }
}
