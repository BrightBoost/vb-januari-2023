package com.company;

import java.time.*;

public class Tijd {
    public static void main(String[] args) {
        // alleen een datum
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2022, 11, 13);

        // alleen een tijd
        LocalTime lt = LocalTime.of(9, 30);

        // datum en een tijd
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 11, 12, 12, 3, 4);
        System.out.println(ldt);
        System.out.println(ldt.getDayOfWeek());

        // datum, tijd en zone
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/Rosario"));
        System.out.println(zdt);
//        for(String zone : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zone);
//        }
    }
}
