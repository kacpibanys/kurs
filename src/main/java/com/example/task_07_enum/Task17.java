package com.example.task_07_enum;

public class Task17 {
    public enum MenuOption {
        START,
        STOP,
        EXIT;


    }

    public static void main(String[] args) {
        MenuOption menuOption = MenuOption.START;

        switch(menuOption){
            case START -> System.out.println("START");
            case STOP -> System.out.println("STOP");
            case EXIT -> System.out.println("EXIT");
        }
    }
}
