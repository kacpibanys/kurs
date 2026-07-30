package com.example.task_07_enum;

public class Task1 {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        boolean isWeekend() {
            return switch (this) {
                case SATURDAY, SUNDAY -> true;
                default -> false;
            };
        }

    }

    public static void main(String[] args) {
        System.out.println("TASK 1");
        DayOfWeek day = DayOfWeek.MONDAY;
        System.out.println(day);

        System.out.println("\nTASK 2");
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }
        System.out.println("\nTASK 3");
        DayOfWeek dayToCompare1 = DayOfWeek.WEDNESDAY;
        DayOfWeek dayToCompare2 = DayOfWeek.THURSDAY;
        System.out.println(dayToCompare1 == dayToCompare2);

        System.out.println("\nTASK 4");
        switch (day) {
            case MONDAY, TUESDAY -> System.out.println("Begining of the week");
            case WEDNESDAY, THURSDAY -> System.out.println("Middle of the week");
            case FRIDAY, SATURDAY, SUNDAY -> System.out.println("End of the week");
        }

        System.out.println("\nTASK 5");
        System.out.println(day.isWeekend());
    }

}
