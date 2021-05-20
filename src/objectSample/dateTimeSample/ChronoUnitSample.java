package objectSample.dateTimeSample;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class ChronoUnitSample {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1999, 5, 16, 18, 0, 0);
        LocalDateTime birthday2 = LocalDateTime.of(2000,3,10,18,0,0);
        System.out.println(ChronoUnit.SECONDS.between(birthday, LocalDateTime.now()) + "秒");
        System.out.println(ChronoUnit.MINUTES.between(birthday, LocalDateTime.now()) + "分");
        System.out.println(ChronoUnit.HOURS.between(birthday, LocalDateTime.now()) + "時間");
        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDateTime.now()) + "日");
        System.out.println(ChronoUnit.WEEKS.between(birthday, LocalDateTime.now()) + "週");
        System.out.println(ChronoUnit.YEARS.between(birthday, LocalDateTime.now()) + "年");
        //birthdayとbirthday2何歳差か
        System.out.println(ChronoUnit.DAYS.between(birthday, birthday2) + "日");
    }


}
