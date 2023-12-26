package telusko.learnings.java8;

import java.time.*;

public class TestDateAndTimeAPI {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();



        System.out.println(dt.toLocalTime());

        String str = """
                This is 
                JAVA
                Language
                """;
        System.out.println(str);

        LocalDateTime local = LocalDateTime.of(1994, Month.JANUARY,10,21,23,45);
        System.out.println( local.toLocalTime());

        ZoneId zone = ZoneId.systemDefault();
        System.out.println("current zone is " +zone); // current zone is Asia/Dubai

        Clock clock = Clock.system(zone);
        LocalDateTime currentClockTime = LocalDateTime.now(clock);
        System.out.println("current clock time based on current zone is " + currentClockTime); // current clock time based on current zone is 2023-12-20T21:51:39.960253

        Clock clock1 = Clock.systemUTC();
        LocalDate localDT = LocalDate.now(clock1);
        System.out.println("local date of clock is " + localDT); // local date of clock is 2023-12-20

        ZonedDateTime zoneDtTime = local.atZone(zone);
        System.out.println("zoned date time is " + zoneDtTime); // zoned date time is 1994-01-10T21:23:45+04:00[Asia/Dubai]

        ZoneId us_zone = ZoneId.of("America/Los_Angeles");
        System.out.println("US zone is " + us_zone); // US zone is America/Los_Angeles

        ZonedDateTime zoneDateTime = ZonedDateTime.now(us_zone);
        System.out.println("current time in US-LA is "+zoneDateTime); // current time in US-LA is 2023-12-20T09:39:20.508417-08:00[America/Los_Angeles]

        System.out.println(local);
        //LocalDate

        // To calculate the difference between 2 dates we can use Period class in Joda API
        LocalDate ldt = LocalDate.now();
        LocalDate localDt = LocalDate.of(1994,10,10);
        Period p = Period.between(localDt,ldt);
        int years = p.getYears();
        int months = p.getMonths();
        int days = p.getDays();
        System.out.println(years + "-"+ months + "-"+ days);


        Period pp = Period.of(29,2,10);
        //pp.




    }


}
