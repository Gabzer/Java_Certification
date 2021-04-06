package 3_text_date_time_numericObjects.practice3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercices3 {
    LocalDate today = LocalDate.now();
    //  today ==> 2021-04-05
    today.plusYears(1).getDayOfWeek();
    //  $49 ==> TUESDAY
    LocalTime teaTime = LocalTime.of(17,30);
    //  teaTime ==> 17:30
    Duration timeGap = Duration.between(LocalTime.now(), teaTime);
    //  timeGap ==> PT-2H-39M-16.7029264S
    timeGap.toMinutes();
    //  $53 ==> -159
    timeGap.toHours();
    //  $54 ==> -2
    timeGap.toMinutesPart();
    //  $55 ==> -39
    LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
    //  tomorrowTeaTime ==> 2021-04-06T17:30

    ZoneId london = ZoneId.of("Europe/London");
    ZoneId katmandu = ZoneId.of("Asia/Katmandu");
    ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
    //  londonTime ==> 2021-04-06T17:30+01:00[Europe/London]
    ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
    //  katmanduTime ==> 2021-04-06T22:15+05:45[Asia/Katmandu]
    katmanduTime.getOffset();
    //  $66 ==> +05:45

    Locale locale = Locale.UK;
    String datePattern = "EE', 'd' of 'MMM yyyy' at 'HH:mm z";
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
    //  dateFormat ==> Text(DayOfWeek,SHORT)', 'Value(DayOfMonth)' of 'T ... fHour,2)' 'ZoneText(SHORT)
    String timeTxt = dateFormat.format(katmanduTime);
    //  timeTxt ==> "Tue, 6 of Apr 2021 at 22:15 NPT"
}
