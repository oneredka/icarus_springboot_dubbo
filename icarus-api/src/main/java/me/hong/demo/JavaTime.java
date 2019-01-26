package me.hong.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * java8时间类处理栗子
 */

public class JavaTime {
    /**
     *
     * 使用ThreadLocal来限制SimpleDateFormat只能在线程内共享
     */
    private static ThreadLocal<DateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    private static String format(Date date) {
        return threadLocal.get().format(date);
    }


    public static void main(String[] args) {
        System.out.println(format(new Date()));

        //使用java8的DateTimeFormatter
        Date date = new Date();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");
        LocalDateTime time1 =  LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
        LocalDateTime time2  = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(time1.format(format));
        System.out.println(time2.format(format));


        System.out.println("LocalDateTime.now() : " + LocalDateTime.now());
        System.out.println("LocalDateTime.of    : " + LocalDateTime.of(2019,01,21,16,22,34));
        System.out.println("LocalDateTime.now().getYear() : " + LocalDateTime.now().getYear());
        System.out.println("LocalDateTime.now().getMonth() : " + LocalDateTime.now().getMonth());
        System.out.println("LocalDateTime.now().getDayOfYear() : " + LocalDateTime.now().getDayOfYear());
        System.out.println("LocalDateTime.now().getDayOfMonth() : " + LocalDateTime.now().getDayOfMonth());
        System.out.println("LocalDateTime.now().getDayOfWeek() : " + LocalDateTime.now().getDayOfWeek());
        System.out.println("LocalDateTime.now().getHour() : " + LocalDateTime.now().getHour());
        System.out.println("LocalDate.now()     :" + LocalDate.now());
        System.out.println("LocalTime.now()     :" + LocalTime.now());
        System.out.println("Instant.now()       :" + Instant.now());
        System.out.println("Duration            :" + Duration.between(LocalTime.of(1,0),LocalTime.of(2,0)));
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDate date1 = LocalDate.of(2019, 01, 21);
        if(date1.equals(LocalDate.now())){
            System.out.printf("Today %s and date1 %s are same date %n", LocalDate.now(), date1);
        }

        LocalDate dateOfBirth = LocalDate.of(1993, 01, 21);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else{
            System.out.println("Sorry, today is not your birthday");
        }

        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(2); // 加2个小时
        System.out.println("now                : " + time);
        System.out.println("Time after 2 hours : " +  newTime);


        LocalDate nextWeek = LocalDate.now().plus(1, ChronoUnit.WEEKS);
        LocalDate beforeWeek = LocalDate.now().minus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + LocalDate.now());
        System.out.println("Date bofore 1 week : " + beforeWeek);
        System.out.println("Date after 1 week : " + nextWeek);

        LocalDate tomorrow = LocalDate.of(2019, 1, 22);
        if(tomorrow.isAfter(LocalDate.now())){
            System.out.println("Tomorrow comes after today");
        }

        LocalDate yesterday = LocalDate.now().minus(1, ChronoUnit.DAYS);
        if(yesterday.isBefore(LocalDate.now())){
            System.out.println("Yesterday is day before today");
        }

        if(LocalDate.now().isLeapYear()){
            System.out.println("This year is Leap year");
        }else {
            System.out.println("2019 is not a Leap year");
        }
    }
}
