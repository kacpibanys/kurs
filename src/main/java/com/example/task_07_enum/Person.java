package com.example.task_07_enum;

public class Person {
    String name;
    Task1.DayOfWeek dayOff;

    Person(String name,Task1.DayOfWeek dayOff){
        this.name=name;
        this.dayOff=dayOff;
    }

    void showDayOff(){
        System.out.println(name + " " + dayOff);
    }
}
