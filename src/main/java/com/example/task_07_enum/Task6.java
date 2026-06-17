package com.example.task_07_enum;

public class Task6 {
    public enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;

        public int days;
        public boolean isHolidaySeason;
        Month(){
            this.days = switch (this.name()){
                case "FEBRUARY" -> 28;
                case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> 30;
                default -> 31;
            };
        }

        public int  getDays(){
            return this.days;
        }
        @Override
        public String toString(){
            return this.name() + "(days: " + this.days + ")";
        }

    }


    public static void main(String[] args) {
        for(Month month : Month.values()){
            //System.out.println(month + " " + month.getDays());
            System.out.println(month.toString());
        }

        System.out.println("ORDINAL");
        for(Month month : Month.values()){
            System.out.println("Ordinal: " + month.ordinal() + " for " + month.name());
            if(month.ordinal() >3 && month.ordinal() <9){
                month.isHolidaySeason = true;
                System.out.println("isHolidaySeason: " + month.isHolidaySeason);
            }else {
                month.isHolidaySeason = false;
                System.out.println("isHolidaySeason: " + month.isHolidaySeason);
            }
        }

        Month month1 = Month.JANUARY;
        Month month2 = Month.APRIL;

        int result1 = month1.compareTo(month2);
        System.out.println(result1);
        int result2 = month2.compareTo(month1);
        System.out.println(result2);

        Person person1 = new Person("Kuba", Task1.DayOfWeek.MONDAY);
        Person person2 = new Person("Alek", Task1.DayOfWeek.FRIDAY);
        person1.showDayOff();
        person2.showDayOff();

        Month[] monthArr = {month1, month2};
        int daysSum = 0;
        for(Month month : monthArr){
            month.toString();
            daysSum += month.getDays();
        }
        System.out.println(daysSum);
    }
}
